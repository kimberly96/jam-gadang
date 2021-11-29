package komputergrafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Soal6 extends JPanel{
    public Soal6() {
        //menambahkan Canvas berukuran 400x200
        this.setPreferredSize(new Dimension(400,200));
        this.setBackground(Color.WHITE);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        //test
        
        g2d.setColor(Color.blue);
        g2d.drawLine(10, 25, 400-10, 25);
        g2d.draw(new Line2D.Double(10, 160, 390, 160));
        
        g2d.setColor(Color.green);
        g2d.fillRect(10, 40, 100, 50);
        
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.black);
        g2d.drawRoundRect(120, 40, 100, 100, 10, 10);
        g2d.drawRect(300, 40, 40, 50);
        
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.orange);
        g2d.fillOval(240, 40, 50, 50);
        g2d.setColor(Color.gray);
        g2d.drawOval(240, 40, 50, 50);
    }
}
