# ⚙️ Arayüz (Interface)

Interface, sadece **ne yapılacağını** tanımlar; **nasıl yapılacağını** değil.  
Tüm metotlar (Java 8 öncesi) `abstract` ve `public` kabul edilir.  
Bir sınıf birden fazla interface’i implement edebilir.

## Ne zaman kullanılır?
- Çoklu kalıtım gerekiyorsa
- Ortak davranış değil, ortak yetenek gerekiyorsa
- Modüler, esnek sistemler kurmak isteniyorsa

## 🧠 Sık Sorulan Sorular ve Cevaplar

### 🔹 Neden arayüze ihtiyaç duyarız?
- Bağımlılığı azaltmak için: Sınıflar, sadece interface'lere bağlı kalır.
- Esneklik sağlar: Yeni sınıflar, interface'i implement ederek kolayca sisteme dahil edilebilir.
- Kodun test edilebilirliğini artırır.
- Bir sınıf birden fazla interface’i implement edebilir (çoklu kalıtım gibi).

### 🔹 Interface içindeki metotlar ne işe yarar?
Metotlar, sınıfların hangi işlevleri gerçekleştirmesi gerektiğini belirtir ama **nasıl** yapılacağını söylemez.

### 🔹 Interface bir şeyi “bilmiyorsa” ne işe yarar?
Interface sadece “sözleşme” sunar. Yani “bu metot olacak” der, ama içini doldurmaz. Ne ile ödendiğini, implement eden sınıf belirler.

### 🔹 Peki ne ile ödendiğini nasıl anlarız?
Interface, `getOdemeTuru()` gibi metotlar içererek, bu bilgiyi sağlayabilir. Her sınıf kendi versiyonunu yazar.

```java
interface OdemeYontemi {
    void ode(double miktar);
    String getOdemeTuru();
}

class KrediKarti implements OdemeYontemi {
    public void ode(double miktar) {
        System.out.println("Kredi kartı ile ödendi: " + miktar);
    }

    public String getOdemeTuru() {
        return "Kredi Kartı";
    }
}
```

## Polimorfik Kullanım:
```java
public void odemeYap(OdemeYontemi yontem) {
    yontem.ode(100);
    System.out.println("Ödeme türü: " + yontem.getOdemeTuru());
}
```

## Özet Tablo

| Özellik       | Abstract Sınıf         | Interface               |
|---------------|-------------------------|--------------------------|
| Gövdeli metot | ✅ Evet                  | ❌ Java 8 öncesi yok     |
| Gövdesiz metot| ✅ Evet                  | ✅ Evet                  |
| Çoklu kalıtım | ❌ Hayır                 | ✅ Evet                  |
| Yapı tanımı   | 🟡 Hem davranış hem yapı| ✅ Sadece yapı tanımı    |
