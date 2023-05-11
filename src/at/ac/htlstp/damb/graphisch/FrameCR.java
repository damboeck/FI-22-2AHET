package at.ac.htlstp.damb.graphisch;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class FrameCR
extends Frame
implements WindowListener, ComponentListener {

    public FrameCR(String title) {
        this.setTitle(title);
        this.setSize(800,600);
        this.addWindowListener(this);
        this.addComponentListener(this);
    }

    @Override
    public abstract void paint(Graphics g);

    @Override
    public void componentResized(ComponentEvent e) {
        this.repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
