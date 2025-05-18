import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JOptionPaneOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("OptionPane Örneği");
        JOptionPane.showMessageDialog(f, "Merhaba , Kodlama Vaktine Hoşgeldiniz");
        JOptionPane.showMessageDialog(f, "Abone Oldun","Abone Olun",JOptionPane.WARNING_MESSAGE);
        String str = JOptionPane.showInputDialog(f,"Adınız");
        System.out.println(str);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
