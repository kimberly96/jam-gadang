package komputergrafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class jamGadang extends JPanel{
    public jamGadang() {
        this.setPreferredSize(new Dimension(650,750));
        Color a = new Color(247, 241, 208);
        this.setBackground(a);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        
        Color b = new Color(178,34,33);
        g.setColor(b);
        g.drawOval(175, 175, 325, 325);
        
          
    }
}
