package lunainc.animaciones;

import javax.swing.*;
import java.awt.*;

public class MaterialUIMovimiento {

    private MaterialUIMovimiento() {}

    public static void add (JComponent c, Color fadeTo, int steps, int interval) {
        new MaterialUITimer (c, fadeTo, steps, interval);
    }

    public static void add (JComponent c, Color fadeTo) {
        add (c, fadeTo, 5, 1000 / 30);
    }

    public static MaterialUITimer getMovement (JComponent c, Color fadeTo, int steps, int interval) {
        return new MaterialUITimer (c, fadeTo, steps, interval);
    }

    public static MaterialUITimer getMovement (JComponent c, Color fadeTo) {
        return getMovement (c, fadeTo, 5, 1000 / 30);
    }

    /**
     * This method create a new effect mouse hover static, not create a wake effect
     * This method is util in all component for click, an example: The boton for JSpinner, JCombobox, JScroolbar
     * @param c is the component
     * @param colorEffect is the color for effect, (For using color, look the MaterialColors class)
     * @param colorOnClick is the color of the component on click on it
     * @return a new MaterialUIMovimientoEstatico this class implement a only MouseListner for moment
     * @author https://github.com/vincenzopalazzo
     */
    public static MaterialUIMovimientoEstatico getStaticMovement(JComponent c, Color colorEffect, Color colorOnClick){
        if(c == null || colorEffect == null){
            throw new IllegalArgumentException("Che input arguments is/are null");
        }
        return new MaterialUIMovimientoEstatico(c.getBackground(), colorEffect, colorOnClick);
    }
}
