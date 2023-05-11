package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Muster2 extends FrameCR{

    public static void main(String[] args) {
        new Muster2();
    }
    public Muster2() {
        super("Muster2");
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        int d = Integer.min(this.getWidth(),this.getHeight())*8/10;
        g.drawOval(this.getWidth()/2-d/2, this.getHeight()/2-d/2,d,d);
    }
}
