import java.util.Scanner;
public class Palindrom_Kelime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String kelime,tmp = "";
System.out.println("kelimeyi gir");
kelime = scan.nextLine();
for(int i = kelime.length() - 1 ; i >= 0 ; i --){
    tmp += kelime.charAt(i);
}
if(tmp.equals(kelime)){
    System.out.println("Kelime Palindromik");
}else
    System.out.println("Kelime palindromik değil");
    }
}