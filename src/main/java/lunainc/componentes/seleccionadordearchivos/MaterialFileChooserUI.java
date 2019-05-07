package lunainc.componentes.seleccionadordearchivos;



import lunainc.utilerias.ImagenesMaterial;
import lunainc.utilerias.MaterialDrawingUtils;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalFileChooserUI;
import java.awt.Graphics;

public class MaterialFileChooserUI extends MetalFileChooserUI {

	public MaterialFileChooserUI (JFileChooser fileChooser) {
		super (fileChooser);
	}

	public static ComponentUI createUI (JComponent c) {
		return new MaterialFileChooserUI ((JFileChooser) c);
	}

	@Override
	public void installUI (JComponent c) {
		super.installUI (c);
		JFileChooser fileChooser = (JFileChooser) c;
		MaterialFileChooserUI ui = (MaterialFileChooserUI) fileChooser.getUI ();

		ui.uninstallIcons (fileChooser);
		ui.uninstallComponents (fileChooser);
		ui.clearIconCache ();

		ui.computerIcon = new ImageIcon (ImagenesMaterial.COMPUTER);
		ui.directoryIcon = new ImageIcon (ImagenesMaterial.FOLDER);
		ui.fileIcon = new ImageIcon (ImagenesMaterial.FILE);
		ui.floppyDriveIcon = new ImageIcon (ImagenesMaterial.FLOPPY_DRIVE);
		ui.hardDriveIcon = new ImageIcon (ImagenesMaterial.HARD_DRIVE);

		ui.homeFolderIcon = new ImageIcon (ImagenesMaterial.HOME);
		ui.listViewIcon = new ImageIcon (ImagenesMaterial.LIST);
		ui.detailsViewIcon = new ImageIcon (ImagenesMaterial.DETAILS);
		ui.newFolderIcon = new ImageIcon (ImagenesMaterial.NEW_FOLDER);
		ui.upFolderIcon = new ImageIcon (ImagenesMaterial.BACK_ARROW);

		ui.openButtonText = "ABRIR";
		ui.cancelButtonText = "CANCELAR";
		ui.helpButtonText = "AYUDA";
		ui.saveButtonText = "GUARDAR";
		ui.directoryOpenButtonText = "ABRIR";
		ui.updateButtonText = "ACTUALIZAR";

		ui.installComponents (fileChooser);
	}

	@Override
	public void paint (Graphics g, JComponent c) {
		super.paint (MaterialDrawingUtils.getAliasedGraphics (g), c);
	}
}
