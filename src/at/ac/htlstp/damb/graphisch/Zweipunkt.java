package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public abstract class Zweipunkt implements Paintable {

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Color getC() {
        return c;
    }

    private Point p1;
    private Point p2;
    private Color c;

    public Zweipunkt(Point p1, Point p2, Color c) {
        this.p1 = p1;
        this.p2 = p2;
        this.c  = c;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
