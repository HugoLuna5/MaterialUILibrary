package lunainc.componentes.list;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicListUI;
import java.awt.*;


public class MaterialListUI extends BasicListUI {

    @SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
    public static ComponentUI createUI(JComponent c) {
        return new MaterialListUI();
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        list = (JList) c;
        list.setBackground(UIManager.getColor("List.background"));
        list.setForeground(UIManager.getColor("List.foreground"));
        list.setBorder(UIManager.getBorder("List.border"));
        list.setFont(UIManager.getFont("List.font"));
        list.setSelectionBackground(UIManager.getColor("List.selectionBackground"));
        list.setSelectionForeground(UIManager.getColor("List.selectionForeground"));
        list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        list.setFocusable(UIManager.getBoolean("List.focusable"));
    }



}
