
# Java `throw` ve `throws` Konusu

Bu döküman, Java'da `throw` ve `throws` anahtar kelimelerinin kullanımını ve farklarını açıklar.

---

## 🎯 Genel Konu: `throw` ve `throws`

### 🔸 `throw`: Gerçekten bir **hata fırlatır** (programı patlatır gibi düşün)
### 🔸 `throws`: Bir metodun **hata fırlatabileceğini** söyler (uyarı gibi düşün)

---

## 💡 Anlayacağımız Şeyler:

- Java'da kendi özel hatamızı (`Exception`) nasıl yazarız
- `throw` ile bu hatayı nasıl **fırlatırız**
- `throws` ile bu hatanın **bildirimi** nasıl yapılır
- Bu hatayı nasıl **yakalarız** ya da yakalamazsak ne olur?

---

## 🔍 Kodlar Üzerinden Adım Adım Açıklama

---

### 📦 1. Kod: Özel Exception sınıfı tanımlıyoruz

```java
public class StudenException extends Exception {
    public StudenException(String msg) {
        super(msg); // Hata mesajını Exception sınıfına gönderir
    }
}
```

🔹 Bu, senin kendi özel hatan.  
🔹 `StudenException` adında bir **checked exception** (kontrollü hata) tanımladın.

🧠 Ne işe yarar?  
Bir yerde "öğrenci bulunamadı" gibi özel bir hata fırlatmak istersen, artık kendi exception'ını kullanabilirsin.

---

### 👨‍🎓 2. Kod: Öğrenci arayan metot

```java
public class Student {
    public static Student find(String id) throws StudenException {
        if (id.equals("123")) {
            return new Student(); // ID doğruysa yeni bir öğrenci döner
        } else {
            throw new StudenException("Ogrenci bulunamadi");
        }
    }
}
```

🔸 Burada olanlar:

- `find` metodu bir `Student` nesnesi döner
- Eğer `id = "123"` ise: yeni `Student` döner
- Eğer değilse: **hata fırlatılır**

👉 `throw new StudenException(...)` → bu, bir hata fırlatır  
👉 `throws StudenException` → bu metodun hata fırlatabileceğini söyler

---

### 🧪 3. Kod: Test sınıfı

```java
public class Test {
    public static void main(String[] args) throws StudenException {
        Student s1 = Student.find("123");
    }
}
```

🔸 Bu kodda:

- `find("123")` çağrılıyor ve `123` doğru olduğu için yeni bir öğrenci nesnesi geliyor.
- `throws StudenException` yazıldığı için, eğer hata olursa programı patlatmak yerine Java bilir ki: "Bu metot hata fırlatabilir."

---

## 🎉 Sonuç olarak:

| Terim   | Açıklama |
|---------|----------|
| `throw` | Hata fırlatır (örnek: `throw new StudenException(...)`) |
| `throws` | Bu metot hata fırlatabilir demektir (metot imzasında yazılır) |
| `try-catch` | Bu hataları programı çökertmeden yakalamak için kullanılır |

---

## 👇 Bu şekilde try-catch eklenirse daha güvenli olur:

```java
public class Test {
    public static void main(String[] args) {
        try {
            Student s1 = Student.find("123");
            System.out.println("Öğrenci bulundu.");
        } catch (StudenException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
```

---

Bu döküman, `throw` ve `throws` konusunu basit ve anlaşılır şekilde anlatmayı hedeflemektedir. Eğer kafan karışan bir yer olursa, lütfen sormaktan çekinme!
