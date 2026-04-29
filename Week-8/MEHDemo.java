import java.awt.*;
import java.awt.event.*;

class MEHDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "", msg2 = "";
    int x = 150, y = 100, x1, y1;

    MEHDemo() {
        addMouseListener(this);         
        addMouseMotionListener(this);    
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
        msg = "Mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
        msg = "Mouse Moved";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 50);
        g.drawString("Mouse at (" + x + ", " + y + ")", 100, 100);
        g.drawString("Motion at (" + x1 + ", " + y1 + ")", 100, 150);
    }

    public static void main(String args[]) {
        MEHDemo md = new MEHDemo();
        md.setTitle("Mouse Event Handling Demo");
        md.setSize(400, 400);
        md.setVisible(true);

        md.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
