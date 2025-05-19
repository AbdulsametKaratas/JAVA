Elbette! Aşağıda Java Swing bileşenlerinin (nesnelerinin) her birinin ne işe yaradığını açık ve sade şekilde tekrar listeliyorum:

---

## 🪟 **1. `JFrame` – Ana pencere**

* Uygulamanın ana penceresidir.
* Tüm diğer bileşenler bu pencereye eklenir.
* Kullanıcı arayüzünün temelidir.

```java
JFrame frame = new JFrame("Başlık");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

---

## 📦 **2. `JPanel` – Panel**

* Bileşenleri gruplamak için kullanılır.
* İçine başka bileşenler konabilir.
* Genellikle arayüzü bölmek için kullanılır.

```java
JPanel panel = new JPanel();
frame.add(panel);
```

---

## 🔘 **3. `JButton` – Buton**

* Tıklanabilir bir düğmedir.
* Kullanıcıdan aksiyon almak için kullanılır.

```java
JButton button = new JButton("Tıkla");
panel.add(button);
```

---

## 🔤 **4. `JLabel` – Etiket**

* Metin veya resim gösterir.
* Genellikle bilgi vermek için kullanılır.

```java
JLabel label = new JLabel("Kullanıcı adı:");
panel.add(label);
```

---

## 🧾 **5. `JTextField` – Metin girişi**

* Kullanıcının tek satır metin girmesi için kullanılır.

```java
JTextField textField = new JTextField(20);
panel.add(textField);
```

---

## 🔐 **6. `JPasswordField` – Şifre girişi**

* Şifre gibi gizli veriler için kullanılır (yazılan karakterler görünmez).

```java
JPasswordField passwordField = new JPasswordField(20);
panel.add(passwordField);
```

---

## ✅ **7. `JCheckBox` – Onay kutusu**

* Seçili veya seçili olmayan bir kutucuktur.
* Çoklu seçim için uygundur.

```java
JCheckBox checkBox = new JCheckBox("Beni hatırla");
panel.add(checkBox);
```

---

## 🔘 **8. `JRadioButton` – Radyo butonu**

* Bir grup içindeki tek seçenek seçimi için kullanılır.
* `ButtonGroup` ile gruplanır.

```java
JRadioButton male = new JRadioButton("Erkek");
JRadioButton female = new JRadioButton("Kadın");
ButtonGroup group = new ButtonGroup();
group.add(male);
group.add(female);
panel.add(male);
panel.add(female);
```

---

## 📋 **9. `JComboBox` – Açılır liste (dropdown)**

* Kullanıcıya seçenek listesi sunar.
* Tek bir seçenek seçilir.

```java
String[] options = {"Seçenek 1", "Seçenek 2"};
JComboBox<String> comboBox = new JComboBox<>(options);
panel.add(comboBox);
```

---

## 📜 **10. `JTextArea` – Çok satırlı metin alanı**

* Birden fazla satır metin girişine izin verir.

```java
JTextArea textArea = new JTextArea(5, 20);
panel.add(textArea);
```

---

## 🔳 **11. `JScrollPane` – Kaydırma paneli**

* İçerik paneli büyüdüğünde kaydırma çubukları ekler.

```java
JScrollPane scrollPane = new JScrollPane(textArea);
panel.add(scrollPane);
```

---

## 📂 **12. `JFileChooser` – Dosya seçici**

* Dosya veya klasör seçmek için kullanılır.

```java
JFileChooser fileChooser = new JFileChooser();
int result = fileChooser.showOpenDialog(null);
```

---

## 🔲 **13. `JTable` – Tablo**

* Verileri tablo biçiminde göstermek için kullanılır.

```java
String[][] data = {
    {"1", "Ali"},
    {"2", "Ayşe"}
};
String[] columns = {"ID", "İsim"};
JTable table = new JTable(data, columns);
panel.add(new JScrollPane(table));
```

---

## ⏳ **14. `JProgressBar` – İlerleme çubuğu**

* İşlem ilerleyişini gösterir.

```java
JProgressBar progressBar = new JProgressBar();
progressBar.setValue(50);
panel.add(progressBar);
```

---

## 🧭 **15. `JMenuBar`, `JMenu`, `JMenuItem` – Menü çubuğu ve öğeleri**

* Menü yapısı oluşturmak için kullanılır.

```java
JMenuBar menuBar = new JMenuBar();
JMenu menu = new JMenu("Dosya");
JMenuItem item = new JMenuItem("Aç");
menu.add(item);
menuBar.add(menu);
frame.setJMenuBar(menuBar);
```

---

İstersen bu bileşenleri içeren örnek bir Swing uygulaması da oluşturabilirim. Yardımcı olayım mı?
