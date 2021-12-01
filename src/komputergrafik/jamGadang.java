package komputergrafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class jamGadang extends JPanel{
    public jamGadang() {
        this.setPreferredSize(new Dimension(650,750));
        Color bgColor = new Color(247, 241, 208);
        this.setBackground(bgColor);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        // Set Oval Color
        Color ovalColor = new Color(178,34,33);
        g.setColor(ovalColor);
        
        // Set Thickness
        g2.setStroke(new BasicStroke(2));
        
        // Draw Oval
        g.drawOval(140, 175, 370, 370);
        
        // Set All of Object Color
        Color c = new Color (31, 30, 29);
        g.setColor(c);
        
        // Set Thickness 
        g2.setStroke(new BasicStroke(2));
        
        // Draw Object From The Top
        QuadCurve2D.Double curve1 = new QuadCurve2D.Double(325,30,315,80,290,100);
        g2.draw(curve1);
        QuadCurve2D.Double curve2 = new QuadCurve2D.Double(325,30,335,80,360,100);
        g2.draw(curve2);
        QuadCurve2D.Double curve3 = new QuadCurve2D.Double(380,30,395,80,360,100);
        g2.draw(curve3);
        QuadCurve2D.Double curve4 = new QuadCurve2D.Double(380,30,390,60,345,80);
        g2.draw(curve4);
        QuadCurve2D.Double curve5 = new QuadCurve2D.Double(270,30,255,80,290,100);
        g2.draw(curve5);
        QuadCurve2D.Double curve6 = new QuadCurve2D.Double(270,30,260,60,305,80);
        g2.draw(curve6);
        
        g.drawRect(290, 100, 70, 60);
        g2.drawRoundRect(310, 130, 30, 50, 30, 20); 
        
        g.setColor(new Color(247, 241, 208));
        g.fillRect(260, 160, 130, 30);
        g.setColor(Color.black);
        g.drawRect(260, 160, 130, 30);
        
          
    }
}
