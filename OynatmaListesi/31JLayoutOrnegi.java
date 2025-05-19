import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JLayoutOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("Layout Örneği");

        JButton jb1 = new JButton("b1");
        JButton jb2 = new JButton("b2");
        JButton jb3 = new JButton("b3");
        JButton jb4 = new JButton("b4");
        JButton jb5 = new JButton("b5");

        JPanel p = new JPanel();

        //p.setLayout(new FlowLayout(FlowLayout.LEFT));  // bir kenara doldurur

        p.setLayout(new GridLayout(3,2)); // ölçeklendiriyor
        p.add(jb1);
        p.add(jb2);
        p.add(jb3);
        p.add(jb4);
        p.add(jb5);

        /*p.setLayout(new BorderLayout());  // kuzey güney doğu batı merkez şeklinde yerleştiriyor
        p.add(jb1, BorderLayout.NORTH);
        p.add(jb2, BorderLayout.SOUTH);
        p.add(jb3, BorderLayout.WEST);
        p.add(jb4, BorderLayout.EAST);
        p.add(jb5, BorderLayout.CENTER);*/

        f.add(p);

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
