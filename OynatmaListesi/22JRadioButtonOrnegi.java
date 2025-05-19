import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class  JRadioButtonOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("RadioButton Örneği");
        JRadioButton r1 = new JRadioButton("Kadın",true); //true başlangıçta seçili gelmesini sağlar
        r1.setBounds(100,50,100,30);
        r1.setActionCommand("kadın seçildi");

        JRadioButton r2 = new JRadioButton("Erkek");
        r2.setBounds(100,100,100,30);
        r2.setActionCommand("erkek seçildi");

        JRadioButton r3 = new JRadioButton("Belirtmek İstemiyorum");
        r3.setBounds(100,150,200,30);
        r3.setActionCommand("belirtmek istemiyorum seçildi");

        ButtonGroup bg = new ButtonGroup();  //Butonları gruplandırarak çoklu seçimi önler
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JButton btn = new JButton("Gönder");
        btn.setBounds(100,200,100,30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(bg.getSelection().getActionCommand());
            }
        });

        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
