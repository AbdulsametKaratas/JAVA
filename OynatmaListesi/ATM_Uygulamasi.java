import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000,miktar,seçim;
        System.out.println("Merhaba JAVA Bank'a hoşgeldiniz");
        System.out.println("Güncel bakiyeniz " + bakiye + " TL");
        System.out.println("1-) Para Yatır");
        System.out.println("2-) Para Çek");
        System.out.println("3-) Bakiye Sorgula");
        System.out.println("4-) Çıkış yap");
        while(bakiye > 0){
            System.out.println("Yapmak istediğiniz işlemi seçin");
            seçim = scan.nextInt();
            if((seçim < 1) || (seçim > 4)){
                System.out.println("Hatalı Tuşlama Tekrar deneyiniz");
                continue;
            }
            if(seçim == 1){
                System.out.println("Yatırılacak tutarı girin");
                miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Tutar Yatırıldı!");
                continue;
            }else if(seçim == 2){
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                miktar = scan.nextInt();
                bakiye -= miktar;
                System.out.println("Tutar Çekildi!");
                continue;
            }else if(seçim == 3){
                System.out.println("Güncel bakiyeniz " + bakiye + "TL");
                continue;
            } else if (seçim == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }
        }
    }
}