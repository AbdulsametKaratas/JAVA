public class ThreadX {
    public static void main(String[] args) {


        İslemler i1 = new İslemler("ilk");
        Thread t1 = new Thread(i1);  // java kutuphanesinde olan thread sinifi

        İslemler i2 = new İslemler("ikinci");
        Thread t2 = new Thread(i2);

        t1.start();  // start metodu icindeki runnable nesnesinin run metodunu cagirir
        t2.start();
    }

}

class İslemler implements Runnable {
    String name;

    public İslemler(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name + " hata ile karsilasildi !");
        }
        System.out.println(this.name + " islem bitti");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
// Thread ayni anda iki islem yapabilmemize olanak saglar
//islemlerin sirasi yoktur sadece ayni anda calisirlar