package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Kreis
extends FlaecheZweipunkt {

    public Kreis(Point p1, Point p2, Color c, boolean fill) {
        super(p1, p2, c, fill);
    }

    public Kreis(int r, Point m, Color c, boolean fill) {
        super(new Point(m.x-r,m.y-r),new Point(m.x+r,m.y+r),c,fill);
    }
    public Kreis(int r, int mx, int my, Color c, boolean fill) {
        this(r, new Point(mx,my),c,fill);
    }

    public Kreis(int r, Point m) {
        this(r,m,Color.blue,false);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getC());
        if (isFill()) g.fillOval(getM().x-getR().x,getM().y-getR().y,2*getR().x,2*getR().y);
        else          g.drawOval(getM().x-getR().x,getM().y-getR().y,2*getR().x,2*getR().y);
    }

    public Point getM() {
        return new Point((getP1().x+getP2().x)/2, (getP1().y+getP2().y)/2);
    }
    public Point getR() {
        int rx = (getP1().x-getP2().x)/2;
        int ry = (getP2().y-getP1().y)/2;
        return new Point(rx>0?rx:-rx, ry>0?ry:-ry);
    }

}
