
package KomputerGrafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class KomputerGrafik {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Aplikasi Komputer Grafik");
  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Soal6 canvas = new Soal6();
        frame.getContentPane().add(canvas);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}