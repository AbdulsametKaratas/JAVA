import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        System.out.println("Program basladi");  // try-catch kullanmasak bile kod hata aldigi yere kadar calismaya devam eder
        int a = 0,b;
        try {                // burda try-catch kullanmasaydık program hatayi gordugu yerde calismayi sonlandirirdi.
            a = 2 / 0;
            System.out.println("Try icerisinde !");  // icerde hata aldigi yerden sonraki kodlar calismaz.
        }catch (ArithmeticException e) {   // ArithmeticException javada otomatik gelen bir sınıftır
            System.out.println(e.getMessage());   // "/ by zero" mesajini dondurur.
        }
        System.out.println(a);


        int[] arr = new int[3];
        try {          // burdaki hatayi ustteki try da ilk satıra yazsaydik yine hata alıdık cünkü catch aritmetik hatalara bakiyor orda
            arr[4] = 10;  // ama 2/0 in altina yazabilirdik cunku kod hatayi gordugu gibi duruyor
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());  // bu da baska bir hata sinifi
        }


        Scanner scan = new Scanner(System.in);
        try {
            b = scan.nextInt();
        }catch (Exception e) {   // butun hatalara bakar. burda int deger disinda bir deger girersek try catch calisir
            System.out.println("Bir hata var");
            System.out.println(e.toString());
        }finally {    // ne olursa olsun  bu kisim calisir
            System.out.println("fİnally kismi");
        }
        System.out.println("Program bitti");
    }
}

// catch in icine hangi exception'in yazilmasi gerektigine dikkat edilmeli her excxeption farkli hatalara  bakar
// ama sadece catch(Exception e) yazilirsa catch butun hatalari kontrol eder
// try tek basina yazilamaz
// bir try birden fazla catch alabilir
// try, catch olmadan finally ile de calisir
// finally kullanmak zorunlu degil
// bir try bir finally kullanabilir