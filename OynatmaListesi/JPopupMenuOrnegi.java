import java.awt.event.*;
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class JPopupMenuOrnegi{
    public static void main(String[] args) {
        JFrame f = new JFrame("PopupMenü Örneği");
        JPopupMenu pm = new JPopupMenu("Menü");

        JMenuItem cut = new JMenuItem("Kes");
        JMenuItem copy = new JMenuItem("Kopyala");
        JMenuItem paste = new JMenuItem("Yapıştır");

        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f,e.getX(),e.getY());
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Kes butonuna tıklandı");
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
