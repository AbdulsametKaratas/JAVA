import java.awt.event.*;
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JProgressBarOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("ProgressBar Örneği");
        JProgressBar jb = new JProgressBar(0,2000);
        jb.setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);

        f.add(jb);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i = 0;
        while(i <= 2000) {
            jb.setValue(i);
            i += 20;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
