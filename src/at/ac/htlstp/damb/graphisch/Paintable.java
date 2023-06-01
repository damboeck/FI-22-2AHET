package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public interface Paintable {

    void paint(Graphics g);
    Color getC();
    void setC(Color c);

}
