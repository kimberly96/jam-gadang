package komputergrafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class jamGadang extends JPanel{
    public jamGadang() {
        this.setPreferredSize(new Dimension(800,600));
        Color a = new Color(255,234,208);
        this.setBackground(a);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        
        Color b = new Color(233,150,122);
        g.setColor(b);
        g.drawOval(WIDTH, WIDTH, WIDTH, WIDTH);
        
          
    }
}
