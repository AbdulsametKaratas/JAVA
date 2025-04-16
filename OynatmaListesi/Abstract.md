# 📐 Soyutlama (Abstraction)

Soyutlama, karmaşık yapıları gizleyerek sadece önemli bilgileri göstermektir. Java’da `abstract` sınıflar ve `abstract` metotlar ile sağlanır.

## Özellikler:
- Hem gövdeli (tam tanımlı) hem de gövdesiz (abstract) metotlar içerebilir.
- `new` ile örneği (instance) oluşturulamaz.
- Soyut sınıflar, ortak davranışları paylaşmak ve alt sınıflarda özelleştirmek için kullanılır.

## 🧠 Sık Sorulan Sorular ve Cevaplar

### 🔹 `abstract` metot ile `abstract` olmayan metot arasındaki fark nedir?
- **abstract metot:** Sadece ismi tanımlanır, gövdesi olmaz. Alt sınıf bu metodu override etmek zorundadır.
- **abstract olmayan metot:** Gövdesi vardır, alt sınıflar isterse override eder ama zorunlu değildir.

```java
abstract class Hayvan {
    abstract void sesCikar(); // Alt sınıf override etmek zorunda
    void yemekYe() {
        System.out.println("Yemek yiyor...");
    }
}
```

### 🔹 Üst sınıftan metot çağırmak için `super` kullanmak gerekir mi?
- Eğer alt sınıf, üst sınıftaki metodu override ettiyse ve yine de üst sınıfın versiyonunu çağırmak istiyorsak `super` kullanırız.

```java
class Kedi extends Hayvan {
    void sesCikar() {
        super.sesCikar(); // Üst sınıftaki metodu çağırır
        System.out.println("Miyav");
    }
}
```

Eğer üst sınıfta `abstract` bir metot varsa `super` ile çağrı yapılamaz çünkü gövdesi yoktur.

---

## 🎯 Örnek:
```java
abstract class Sekil {
    abstract void ciz(); // soyut metot
    void bilgiVer() {
        System.out.println("Bu bir şekildir.");
    }
}

class Daire extends Sekil {
    void ciz() {
        System.out.println("Daire çiziliyor.");
    }
}
```

## ✅ Özet:
| Özellik                | Açıklama                                      |
|------------------------|-----------------------------------------------|
| Soyut sınıf            | `abstract` anahtar kelimesi ile tanımlanır    |
| Gövdeli metot          | Evet (isteğe bağlı override edilir)           |
| Gövdesiz metot         | Evet (abstract metot, override zorunlu)       |
| Nesne oluşturulabilir mi? | Hayır (`new` ile doğrudan oluşturulamaz)  |
