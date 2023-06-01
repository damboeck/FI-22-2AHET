package at.ac.htlstp.damb.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Vector;

public class Paint
extends FrameMT {

    private Vector<Paintable> elements;
    private boolean newElement;

    public static void main(String[] args) {
        new Paint();
    }

    public Paint() {
        super("Paint");
        elements   = new Vector<>();
        newElement = true;
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        for (Paintable p:elements)
            p.paint(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!newElement) {
            Paintable p = elements.lastElement();
            switch (e.getKeyChar()) {
                case 'b' : p.setC(Color.blue); break;
                case 'r' : p.setC(Color.red);  break;
                case 'g' : p.setC(Color.green);break;
            }
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton()==MouseEvent.BUTTON1) {
            if (newElement) {
                Paintable p = new Kreis(e.getPoint(), e.getPoint(),Color.red,false);
                newElement=false;
                elements.add(p);
            } else {
                Paintable p = elements.lastElement();
                if (p instanceof Zweipunkt) {
                    ((Zweipunkt) p).setP2(e.getPoint());
                    newElement=true;
                }
            }
        } else if (e.getButton()==MouseEvent.BUTTON3) {

        }
        repaint();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

    }
    @Override
    public void mouseMoved(MouseEvent e) {
        if (!newElement) {
            Paintable p = elements.lastElement();
            if (p instanceof Zweipunkt) {
                ((Zweipunkt) p).setP2(e.getPoint());
            }
            repaint();
        }
    }
}
