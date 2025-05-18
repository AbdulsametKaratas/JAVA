import java.awt.event.ActionEvent;  // Buton tıklamaları gibi olayları yakalamak için kullanılır
import java.awt.event.ActionListener;  // Olaylara tepki vermek için kullanılır (örneğin buton tıklanınca yapılacaklar)
import javax.swing.*;  // JFrame, JButton, JLabel, JTextField gibi Swing bileşenlerini içeren paket

public class GUI {
    public static void main(String[] args) {
        // Yeni bir pencere (JFrame) oluşturuluyor ve başlığı belirleniyor
        JFrame f = new JFrame("Textfield");

        // Metin alanları ve etiketler için değişken tanımları
        JTextField t1, t2, t3;
        JLabel l1, l2, l3;
        JButton btn;

        // İlk sayının etiketini oluştur ve konumlandır
        l1 = new JLabel("ilk sayı");
        l1.setBounds(50, 10, 100, 30);

        // İlk sayı için kullanıcıdan giriş alınacak metin kutusu
        t1 = new JTextField();
        t1.setBounds(50, 40, 200, 30);

        // İkinci sayının etiketini oluştur ve konumlandır
        l2 = new JLabel("ikinci sayı");
        l2.setBounds(50, 70, 100, 30);

        // İkinci sayı için kullanıcıdan giriş alınacak metin kutusu
        t2 = new JTextField();
        t2.setBounds(50, 100, 200, 30);

        // Sonucun gösterileceği alan için etiket
        l3 = new JLabel("toplam");
        l3.setBounds(50, 130, 100, 30);

        // Toplam sonucu gösterilecek metin kutusu (kullanıcı tarafından düzenlenemez)
        t3 = new JTextField();
        t3.setBounds(50, 160, 200, 30);
        t3.setEditable(false);  // Kullanıcının bu alanı değiştirmesini engeller

        // Toplama işlemini başlatacak buton oluşturuluyor
        btn = new JButton("toplam");
        btn.setBounds(50, 190, 220, 30);

        // Butona tıklandığında çalışacak işlemler
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // t1 ve t2'den alınan metinler tam sayıya çevrilir
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                // Toplama işlemi yapılır
                int c = a + b;

                // Sonuç String'e çevrilerek t3'e yazılır
                String toplam = String.valueOf(c);
                t3.setText(toplam);
            }
        });

        // Tüm bileşenler pencereye ekleniyor
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(btn);

        // Pencere kapatıldığında program sonlansın
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pencere boyutu ayarlanıyor
        f.setSize(400, 400);

        // Bileşenlerin elle konumlandırılması için layout devre dışı bırakılıyor
        f.setLayout(null);

        // Pencere görünür hale getiriliyor
        f.setVisible(true);
    }
}
