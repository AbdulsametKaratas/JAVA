import java.awt.event.*;
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JTabbedPaneOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("JTabbedPane Örneği");

        JPanel p1 = new JPanel();
        JLabel lb1 = new JLabel("İlk Alan");
        p1.add(lb1);

        JPanel p2 = new JPanel();
        JLabel lb2 = new JLabel("İkinci Alan");
        p2.add(lb2);

        JPanel p3 = new JPanel();
        JLabel lb3 = new JLabel("Üçüncü Alan");
        p3.add(lb3);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("ilk", p1);
        tp.add("ikinci", p2);
        tp.add("üçüncü", p3);

        f.add(tp);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
