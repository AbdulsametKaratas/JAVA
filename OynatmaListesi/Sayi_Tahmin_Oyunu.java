import java.util.Scanner;
import java.util.Random;
public class Sayi_Tahmin_Oyunu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int  tahmin,can = 5,i = 0;
        int[] tahminler = new int[10];
        Random rand = new Random();
        int sayi = rand.nextInt(100);
        boolean oyunDurumu = false;
        System.out.println("Sayi Tahmin Oyununa Hosgeldiniz");
        System.out.println("0-99 arasi bir sayi tuttum tahmin et!");
        while(can > 0){
            System.out.print("Tahmininiz:");
            tahmin = scan.nextInt();
            if(tahmin < 0 || tahmin > 99){
                System.out.println("0-99 Arasi demistim düzgün gir");
                continue;
            }
            tahminler[i++] = tahmin;
            if(tahmin == sayi){
                oyunDurumu = true;
                break;
            }else if(tahmin > sayi){
                System.out.println("Daha kucuk bir sayi girmen lazim Kalan Can :" + --can);
              } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi girmen lazim. Kalan Can : " + --can);

            }
        }
        if(oyunDurumu){
            System.out.printf("Tebrikler doğru tahmin ettiniz ve %d caniniz kaldi\n" , can);
        }
        if(can <= 0){
            System.out.println("Maalesef canlariniz bitti");
        }
        System.out.println("Tahmin sayilari");
        for(int value : tahminler){
            if(value != 0)
            System.out.print(" " + value);
        }
        if(can == 0){
            System.out.printf("\nTahmin edemedin cevap :" + sayi);
        }
    }
}
