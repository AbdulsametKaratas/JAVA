public class Final_Kullanimi {
    public int sayi1, sayi2;
    public String renk;
    final static double PI = 3.14;

    Final_Kullanimi(int sayi1, int sayi2, String renk) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.renk = renk;
    }

    public int toplama() {
        return this.sayi1 + this.sayi2;
    }

    public int cikarma() {
        return this.sayi1 - this.sayi2;
    }

    public int carpma() {
        return this.sayi1 * this.sayi2;
    }

    public int bolme() {
        return this.sayi1 / this.sayi2;
    }

    public double alan(int r) {
        return Final_Kullanimi.PI * (Math.pow(r, 2));
    }

    public static void main(String[] args) {
        Final_Kullanimi h1 = new Final_Kullanimi(20, 10, "red");
        System.out.println(Final_Kullanimi.PI);
        System.out.println(h1.alan(10));
    }
}
// Final deyimi degismesini istemedigimiz degerlerin sabitlenmesini saglar(ornek: pi sayisi)