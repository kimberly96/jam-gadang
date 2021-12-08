package komputergrafik;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;
import static java.lang.Math.*;
import java.time.LocalTime;

public class jamGadang extends JPanel{
    
   final float degrees06 = (float) (PI / 30);
   final float degrees30 = degrees06 * 5;
   final float degrees90 = degrees30 * 3;
 
   final int diameter = 80;
   final int titikX = 40;
   final int titikY = 40;
   
    public jamGadang() {
        this.setPreferredSize(new Dimension(650,750));
        Color bgColor = new Color(241, 250, 207);
        this.setBackground(bgColor);
        
        new Timer(1000, (ActionEvent e) -> {
         repaint();
      }).start();
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
        g.drawOval(100, 175, 450, 450);
        
        // Set All of Object Color
        Color c = new Color (31, 30, 29);
        g.setColor(c);
        
        // Set Thickness 
        g2.setStroke(new BasicStroke(2));
        
        // Draw Object From The Top
        g.setColor(new Color(126, 163, 247));
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
        
        // Draw bangunan yang ada pintu
       
        g.drawRect(290, 100, 70, 60);
        g2.drawRoundRect(310, 130, 30, 50, 30, 20); 
        
        // Draw balkon
       
        
        g.setColor(new Color (241, 250, 207));
        g.fillRect(260, 160, 130, 30);
        g.setColor(new Color (126, 163, 247));
        g.drawRect(260, 160, 130, 30);
        
        // Draw garis balkon
        for (int i=1; i<=3; i++) {
            g.drawLine(260+(i*32), 160, 260+(i*32), 190);
        }      
        
        // Draw kotak jam
       
        g.drawRect(275,190,100,100);
        
        // Draw kotak1
       
        //Color h = new Color(126, 163, 247);
        //g.setColor(h);
        g.drawRect(265,290,120,60);
        
        // Draw jendela1
        for (int i=1; i<=2; i++) {
            g.drawRect(265+(i*35),300,15,20);
            g.drawRect(265+(i*35),320,15,20);
        } 
       
        // Draw kotak2
        g.drawRect(255,350,140,60);

        // Draw jendela2
        for (int i=1; i<=3; i++) {
            g.drawRect(255+(i*32),360,15,20);
            g.drawRect(255+(i*32),380,15,20);
        } 
               
        // Draw kotak3
        g.drawRect(250,410,150,80);
        
        // Draw jendela3
        for (int i=1; i<=3; i++) {
            g.drawRect(250+(i*34),430,15,20);
            g.drawRect(250+(i*34),450,15,20);
        } 
        
        // Draw garis pembagi kotak kotak
        int y = 290;
        for (int i=0; i<3; i++) {
            g.drawLine(260-(i*10), y, 390+(i*10), y);
            y = y+60;
        } 
        
        // Draw gerbang1
        g.setColor(new Color(126, 163, 247));
        Polygon p1 = new Polygon();
        p1.addPoint(230,480);//kiri atas
        p1.addPoint(230,530);//kiri bawah
        p1.addPoint(280,530);//kanan bawah
        p1.addPoint(305,490);//kanan atas
        p1.addPoint(305,480);//kanan atas
        g.setColor(new Color(247, 241, 208));
        g.fillPolygon(p1);
        g.setColor(new Color(126, 163, 247));
        g.drawPolygon(p1);

        
        // Draw gerbang2
        Polygon p2 = new Polygon();
        p2.addPoint(420,480);//kiri atas
        p2.addPoint(420,530);//kiri bawah
        p2.addPoint(370,530);//kanan bawah
        p2.addPoint(345,490);//kanan atas
        p2.addPoint(345,480);//kanan atas
        g.setColor(new Color(247, 241, 208));
        g.fillPolygon(p2);
        g.setColor(new Color(126, 163, 247));
        g.drawPolygon(p2);
        
        // Draw gerbang4
        for (int i=0; i<2; i++) {
            g.drawRect(230,530+(i*20),50,20);
        } 
      
        
        // Draw gerbang5
        for (int i=0; i<2; i++) {
            g.drawRect(370,530+(i*20),50,20);
        } 
        
        g.drawLine(180,570,470,570);
       

        // Draw pintu
        QuadCurve2D.Double pintu = new QuadCurve2D.Double(300,570,325,460,350,570);
        g2.draw(pintu);
        
        // Draw Clock
        Graphics2D gc = (Graphics2D) g;
        gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 
        drawFace(gc);

        final LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        float angle = degrees90 - (degrees06 * second);
        drawHand(gc, angle, 120 / 2 - 30, Color.red);

        float minsecs = (minute + second / 60.0F);
        angle = degrees90 - (degrees06 * minsecs);
        drawHand(gc, angle, diameter / 3 + 10, Color.black);

        float hourmins = (hour + minsecs / 60.0F);
        angle = degrees90 - (degrees30 * hourmins);
        drawHand(gc, angle, diameter / 4 + 10, Color.black);
        
    }
    
    private void drawFace(Graphics2D g) {
      g.setStroke(new BasicStroke(2));
      g.setColor(new Color(247, 241, 208));
      g.translate(285,200);
      g.fillOval(0, 0, diameter, diameter);
      g.setColor(Color.black);
      g.drawOval(0, 0, diameter, diameter);
   }
 
   private void drawHand(Graphics2D g, float angle, int radius, Color color) {
      int x = titikX + (int) (radius * cos(angle));
      int y = titikY - (int) (radius * sin(angle));
      g.setColor(color);
      g.drawLine(titikX, titikY, x, y);
   }
}
