import java.io.*;  //dosya ilemleri icin gereken siniflar

public class DosyaIslemleri {
    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");  //kod.txt adinda bir dosya nesnesi olusturur (daha henuz fiziksel olarak dosya olusmadi).
        if (!file.exists()) {  //Eger kod.txt dosyasi daha once olusturulmamissa, fiziksel olarak dosyayı olusturur
            file.createNewFile();
        }
        System.out.println("Dosya oluşturulduğu yer: " + file.getAbsolutePath());  // dosya konumunu verir

        // yazma
        String val = "Kodlama Vakti !";
        FileWriter fw = new FileWriter(file,false);  //FileWriter nesnesi olusturuluyor. false parametresi, onceki icerikleri silip uzerine yazacagini belirtir (append degil, overwrite)
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(val);  // ilk tanimlanan "Kodlama Vakti !" metni dosyaya yazilir
        bw.write("\nJava Dersleri");
        bw.close();

        // okuma
        FileReader fr = new FileReader(file);  //Dosyayi okumak icin FileReader nesnesi olusturulur
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {  //Satir satir dosya okunur.Satir bos degilse, konsola yazdirilir.
            System.out.println(line);
        }
        br.close();

    }
}
