package lunainc.componentes.paneldetexto;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextPaneUI;


public class MaterialTextPaneUI extends BasicTextPaneUI {


	@SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
	public static ComponentUI createUI(JComponent c) {
		return new MaterialTextPaneUI();
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		c.setBackground(UIManager.getColor("TextPane.background"));
		c.setForeground(UIManager.getColor("TextPane.foreground"));
		c.setBorder(UIManager.getBorder("TextPane.border"));
		c.setFont(UIManager.getFont("TextPane.font"));
	}
}
