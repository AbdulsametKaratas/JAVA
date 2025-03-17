public class String_Fonksiyonlari {
    public static void main(String[] args){
// str.length(): Girilen karakterin sayısını döndürür.
// str1.concat(str2): String birleştirme
// str.indexOf('K'): karakterin konumunu verir
// str.charAt(5) indexOf metoduna benzer şekilde bu sefer de konumu verilen karakteri okur
//str.compareTo("Kodlama") büyük/küçük fark duyarlı olarak karşılaştırır.
// str.compareToIgnoreCase("KODlama") büyük küçük harf duyarlı olmadan karşılatırır.
// str.contains("kod"): girilen değer string içinde geçiyor mu diye kontrol eder.
// str.endsWith("a") belirtilen karakter (ler) ile bitiyorsa true değerini döndürür.
// str.replace("Kodlama", "Vakti") string değiştirme için kullanılır.
// str.toLowerCase(), str.toUpperCase();
// char[] str = ['K', '0', 'D', 'L', 'A', 'M', 'A');
// String metin = new String(str);
//System.out.println(metin);
        String metin = "KODLAMA HELLO";
        String metin2 = "VAKTİ";
        System.out.println(metin.length());
        System.out.println(metin + metin2);
        System.out.println(metin.concat(metin2));
        System.out.println(metin.indexOf('L'));
        System.out.println(metin.charAt(1));
        System.out.println(metin.endsWith("lo"));
        System.out.println(metin.replace("HELLO", "VAKTİ"));
        System.out.println(metin.toLowerCase());
    }
}
