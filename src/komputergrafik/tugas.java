/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.awt.Dimension;

/**
 *
 * @author lenovo
 */
public class tugas extends JApplet {
     public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Jam Gadang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new tugas();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);  
    }
   
    public void init() {
        JPanel panel = new Panel2D();
        getContentPane().add(panel);
    }
    
   
    class Panel2D extends JPanel {
        public Panel2D() {
            setPreferredSize(new Dimension(1200, 700));
            setBackground(Color.LIGHT_GRAY);
        }
        public void paintComponent(Graphics g) {
            Dimension d = getSize();
            int maxX = d.width-1; int maxY = d.height-1;
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            Color warna;
                     
            
        }
    }
}
