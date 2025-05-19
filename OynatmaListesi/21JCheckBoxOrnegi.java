import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JCheckBoxOrnegi {
    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBox Örneği");
        JCheckBox ch1 = new JCheckBox("Evet");
        ch1.setBounds(150,100,250,50);

        JCheckBox ch2 = new JCheckBox("Hayır");
        ch2.setBounds(150,150,250,50);

        JButton btn = new JButton("Gönder");
        btn.setBounds(125,200,100,30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ch1.isSelected() && ch2.isSelected()){
                    System.out.println(ch1.getText() + " ve " + ch2.getText() + " Seçildi");
                } else if (ch1.isSelected()) {
                    System.out.println(ch1.getText() + " Seçildi");
                } else if (ch2.isSelected()) {
                    System.out.println(ch2.getText() + " Seçildi");
                }else {
                    System.out.println("Hiçbir seçenek seçilmedi");
                }
            }
        });

        f.add(ch1);
        f.add(ch2);
        f.add(btn);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
