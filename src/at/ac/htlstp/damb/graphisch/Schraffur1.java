package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Schraffur1 extends Linie1 {
    public Schraffur1(String name, int breite, int hoehe) {
        super(name, breite, hoehe);
    }

    public static void main(String[] args) {
        new Schraffur1("Schraffur",800,600);
    }

    @Override
    public void paint(Graphics g) {
        int d = Integer.max(this.getWidth(), this.getHeight());
        // horizontaler bzw. vertikaler Abstand der Linien
        int a = (this.getWidth()+this.getHeight())/11;
        for (int x=a-this.getHeight();x<this.getWidth();x+=a) g.drawLine(x,0,x+d,d);
    }
}
