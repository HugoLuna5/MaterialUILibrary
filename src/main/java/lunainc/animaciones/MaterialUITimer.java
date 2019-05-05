package lunainc.animaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaterialUITimer implements MouseListener, ActionListener, MouseMotionListener {

    private Color from, to;
    private boolean forward;
    private int alpha, steps;
    private int[] forwardDeltas, backwardDeltas;

    private JComponent component;
    private Timer timer;

    protected MaterialUITimer(JComponent component, Color to, int steps, int interval) {
        if (component == null || !component.isEnabled()) {
            return;
        }
        this.from = component.getBackground();
        this.to = to;

        this.forwardDeltas = new int[4];
        this.backwardDeltas = new int[4];

        forwardDeltas[0] = (from.getRed() - to.getRed()) / steps;
        forwardDeltas[1] = (from.getGreen() - to.getGreen()) / steps;
        forwardDeltas[2] = (from.getBlue() - to.getBlue()) / steps;
        forwardDeltas[3] = (from.getAlpha() - to.getAlpha()) / steps;

        backwardDeltas[0] = (to.getRed() - from.getRed()) / steps;
        backwardDeltas[1] = (to.getGreen() - from.getGreen()) / steps;
        backwardDeltas[2] = (to.getBlue() - from.getBlue()) / steps;
        backwardDeltas[3] = (to.getAlpha() - from.getAlpha()) / steps;

        this.steps = steps;

        this.component = component;
        timer = new Timer(interval, this);
        component.setBackground(from);
    }

    private Color nextColor() {
        int rValue = from.getRed() - alpha * forwardDeltas[0];
        int gValue = from.getGreen() - alpha * forwardDeltas[1];
        int bValue = from.getBlue() - alpha * forwardDeltas[2];
        int aValue = from.getAlpha() - alpha * forwardDeltas[3];

        return new Color(rValue, gValue, bValue, aValue);
    }

    private Color previousColor() {
        int rValue = to.getRed() - (steps - alpha) * backwardDeltas[0];
        int gValue = to.getGreen() - (steps - alpha) * backwardDeltas[1];
        int bValue = to.getBlue() - (steps - alpha) * backwardDeltas[2];
        int aValue = to.getAlpha() - (steps - alpha) * backwardDeltas[3];

        return new Color(rValue, gValue, bValue, aValue);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (!me.getComponent().isEnabled()) {
            return;
        }
        alpha = steps - 1;
        forward = false;
        if(timer.isRunning()){
            timer.stop();
        }
        timer.start();

        alpha = 0;
        forward = true;
        timer.start();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //do nothing
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        //do nothing
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (!me.getComponent().isEnabled()) {
            return;
        }
        if(timer.isRunning()){
            timer.stop();
        }
        alpha = steps - 1;
        forward = false;
        timer.start();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (!me.getComponent().isEnabled()) {
            return;
        }
        alpha = 0;
        forward = true;
        if(timer.isRunning()){
            timer.stop();
        }
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (forward) {
            component.setBackground(nextColor());
            ++alpha;
        } else {
            component.setBackground(previousColor());
            --alpha;
        }

        if (alpha == steps + 1 || alpha == -1) {
            if(timer.isRunning()){
                timer.stop();
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //do nothing this is util only implements interface MouseMotions
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //do nothing this is util only implements interface MouseMotions
    }
}
