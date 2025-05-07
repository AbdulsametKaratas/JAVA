### 🎯 **Neden `BufferedWriter` kullanılır?**

`BufferedWriter`, verileri **önce bellekte bir arabellek (buffer)** içinde toplar, sonra **toplu hâlde** diske yazar. Bu şu avantajları sağlar:

#### 🧠 1. **Performans**

* `FileWriter` her `.write()` çağrısında doğrudan dosyaya yazar → bu **yavaş** olabilir.
* `BufferedWriter`, veriyi önce bellekte biriktirir, sonra **tek seferde** dosyaya yazar → bu **daha hızlıdır**.

#### 📦 2. **Kaynak Tasarrufu**

* Disk yazma işlemi daha az sayıda yapılır.
* Bu, hem **sistem kaynaklarını korur**, hem de **donanım ömrünü** uzatır (özellikle SSD’lerde önemlidir).

---

### 🎯 **Neden `BufferedReader` kullanılır?**

Aynı mantık `BufferedReader` için de geçerli. Okuma işlemlerinde:

* `FileReader` dosyayı **karakter karakter** okur → bu da yavaş olabilir.
* `BufferedReader` ise dosyayı **daha büyük bloklar hâlinde** okur → bu da okuma işlemini hızlandırır.

---

### 🎯 Bir benzetme ile anlatırsak:

Dosya işlemlerini su taşıma işine benzetelim:

* `FileWriter` → her bir damlayı **tek tek kovayla** taşıyor.
* `BufferedWriter` → önce suyu **bir varilde** biriktiriyor, sonra tek seferde taşıyor.

---

### Ne zaman `BufferedWriter` kullanmalı?

✅ Her zaman büyük ya da çok sayıda veri yazıyorsan
✅ Performans senin için önemliyse
✅ Birden fazla `.write()` işlemin varsa

## BU DOSYA DosyaIslemleri.java DOSYASINDA KULLANILAN BUFFER METODLARIN NEDEN KULLANILDIGINA CEVABEN HAZIRLANDI
