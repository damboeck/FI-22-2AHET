package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public abstract class FlaecheZweipunkt extends Zweipunkt{

    private boolean fill;

    public FlaecheZweipunkt(Point p1, Point p2, Color c, boolean fill) {
        super(p1, p2, c);
        this.fill = fill;
    }

    public boolean isFill() {
        return fill;
    }
}
