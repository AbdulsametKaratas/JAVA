import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JScrollBarOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("JScroolBar Örneği");
        JLabel lbl = new JLabel();
        lbl.setBounds(100,50,300,30);

        JScrollBar s = new JScrollBar(JScrollBar.VERTICAL);
        s.setMaximum(100);
        s.setMinimum(0);
        s.setBounds(100,100,50,100);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lbl.setText("ScrollBar Değeri : " + (s.getValue() + s.getModel().getExtent()));
            }
        });


        f.add(lbl);
        f.add(s);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
