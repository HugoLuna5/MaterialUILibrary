package lunainc.animaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MaterialUIMovimientoEstatico implements MouseListener {

    private Color before;
    private Color after;
    private Color strongOnClick;

    public MaterialUIMovimientoEstatico(Color before, Color after, Color strongOnClick) {
        this.before = before;
        this.after = after;
        this.strongOnClick = strongOnClick;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // do nothing
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e == null){
            throw new IllegalArgumentException("MouseEvent null");
        }
        setColorComponent(e, strongOnClick);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e == null){
            throw new IllegalArgumentException("MouseEvent null");
        }
        setColorComponent(e, after);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e == null){
            throw new IllegalArgumentException("MouseEvent null");
        }
        setColorComponent(e, after);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e == null){
            throw new IllegalArgumentException("MouseEvent null");
        }
        setColorComponent(e, before);
    }

    /**
     * This is service method for recicle code
     */
    private void setColorComponent(MouseEvent e, Color colorComponent){
        if(e == null || colorComponent == null){
            throw new IllegalArgumentException("The argument function is/are null");
        }
        JComponent component = (JComponent) e.getSource();
        if(component.isEnabled()){
            component.setBackground(colorComponent);
        }
    }
}
