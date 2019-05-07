package lunainc.componentes.paneleditor;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicEditorPaneUI;

public class MaterialEditorPaneUI extends BasicEditorPaneUI {

	public static ComponentUI createUI (JComponent c) {
		return new MaterialEditorPaneUI ();
	}

	@Override
	public void installUI (JComponent c) {
		super.installUI (c);
	}
}
