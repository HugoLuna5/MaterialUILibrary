package lunainc.componentes.progressbar;



import lunainc.utilerias.BordesMaterial;
import lunainc.utilerias.ColoresMaterial;
import lunainc.utilerias.MaterialDrawingUtils;

import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.Graphics;



public class MaterialProgressBarUI extends BasicProgressBarUI {

	public static ComponentUI createUI (JComponent c) {
		return new MaterialProgressBarUI ();
	}

	@Override
	public void installUI (JComponent c) {
		super.installUI (c);

		JProgressBar progressBar = (JProgressBar) c;
		progressBar.setBorder (BordesMaterial.LIGHT_LINE_BORDER);
		progressBar.setBackground (ColoresMaterial.GRAY_200);
		progressBar.setForeground (ColoresMaterial.LIGHT_BLUE_400);
	}

	@Override
	public void paint (Graphics g, JComponent c) {
		super.paint (MaterialDrawingUtils.getAliasedGraphics (g), c);
	}

}
