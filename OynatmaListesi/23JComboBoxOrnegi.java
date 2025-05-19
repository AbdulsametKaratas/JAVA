import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JComboBoxOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("ComboBox Örneği");
        String arr[] = {"C","C#","C++","Java","Pyhton"};
        JComboBox cb = new JComboBox(arr);
        cb.setBounds(50,100,90,20);

        JButton btn = new JButton("Seç");
        btn.setBounds(50,150,80,20);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = "Seçilen Programlama Dili : " + cb.getSelectedItem();
                System.out.println(text);
            }
        });

        f.add(cb);
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
