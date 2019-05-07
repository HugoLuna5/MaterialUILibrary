
package lunainc.componentes.campodetextoformateador;


import lunainc.utilerias.MaterialDrawingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicFormattedTextFieldUI;
import java.awt.*;


public class MaterialFormattedTextFieldUI extends BasicFormattedTextFieldUI {


    @SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
    public static ComponentUI createUI(JComponent c) {
        return new MaterialFormattedTextFieldUI();
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        JFormattedTextField formattedTextField = (JFormattedTextField) c;
        formattedTextField.setSelectionColor(UIManager.getColor("FormattedTextField.selectionBackground"));
        formattedTextField.setSelectedTextColor(UIManager.getColor("FormattedTextField.selectionForeground"));
        formattedTextField.setBackground(UIManager.getColor("FormattedTextField.inactiveBackground"));
        formattedTextField.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
        formattedTextField.setFont(UIManager.getFont("FormattedTextField.font"));
        formattedTextField.setBorder(UIManager.getBorder("FormattedTextField.border"));
    }

    @Override
    protected void paintBackground(Graphics g) {
        super.paintBackground(MaterialDrawingUtils.getAliasedGraphics(g));
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(MaterialDrawingUtils.getAliasedGraphics(g), c);
    }


}
