import java.util.Scanner;

public class ATM_Uygulamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000,miktar,secim;
        System.out.println("Merhaba JAVA Bank'a hoşgeldiniz");
        System.out.println("Güncel bakiyeniz " + bakiye + " TL");
        System.out.println("1-) Para Yatir");
        System.out.println("2-) Para Cek");
        System.out.println("3-) Bakiye Sorgula");
        System.out.println("4-) Cikis yap");
        while(bakiye >= 0){
            System.out.println("Yapmak istediginiz işlemi secin");
            secim = scan.nextInt();
            if((secim < 1) || (secim > 4)){
                System.out.println("Hatali Tuslama Tekrar deneyiniz");
                continue;
            }
            if(secim == 1){
                System.out.println("Yatirilacak tutari girin");
                miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Tutar Yatirildi!");
            }else if(secim == 2){
                System.out.println("Cekmek istediginiz tutari giriniz");
                miktar = scan.nextInt();
                bakiye -= miktar;
                System.out.println("Tutar Cekildi!");
            }else if(secim == 3){
                System.out.println("Guncel bakiyeniz " + bakiye + "TL");
            } else {
                System.out.println("Cikis yapiliyor...");
                break;
            }
        }
    }
}