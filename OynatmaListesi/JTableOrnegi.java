import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JTableOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Örneği");
        String[][] veri = {{"1","Mat","85"},{"2","Fen","50"},{"3","Türkçe","100"}};
        String[] baslik = {"ID","DERS","NOT"};
        JTable jt = new JTable(veri, baslik);
        jt.setBounds(30,40,200,300);

        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
