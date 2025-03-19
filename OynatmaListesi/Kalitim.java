public class Kalitim {
    public static void main(String[] args) {
        Asistan as = new Asistan("Samet", "m@gmail.com", "0541 000 4880", "CENG", "Lab Hocası", "CENG 101 LAB", "Var");
        Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "0555 000 0000", "CENG", "Hoca", "CENG 101");
        Ogretim_Uyesi o = new Ogretim_Uyesi("Fatih", "f@gmail.com", "0546 000 0000", "FİZ", "Hoca", "FİZ 102", "Araştırma görevlisi");
        Calisan c = new Calisan("Veli", "a@gmail.com", "0555 000 0000");
        Guvenlik_Gorevlisi g = new Guvenlik_Gorevlisi("Yusuf", "y@gmail.com", "0531 687 9080", "guvenlik", "8 saat", "isg");
        
        System.out.println(as.getAdSoyad());
        System.out.println(a.getAdSoyad());
        System.out.println(o.getAdSoyad());
        System.out.println(o.giris());
        System.out.println(c.giris());
        System.out.println(g.giris());
    }
}

class Calisan {
    private String adSoyad, eposta, telefon;

    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String giris() {
        return this.adSoyad + " giris yapti";
    }

    public String cikis() {
        return this.adSoyad + " cikis yapti";
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}

class Akademisyen extends Calisan {
    private String bolum, gorev, ders;

    public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorev, String ders) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorev = gorev;
        this.ders = ders;
    }

    public String giris() {
        return super.giris() + " A kapisindan";
    }

    public String cikis() {
        return super.cikis() + " A kapisindan";
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public void derseGir() {
        System.out.println("Derse girildi !");
    }
}

class Asistan extends Akademisyen {
    private String yuksekLisans;

    public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorev, String ders, String yuksekLisans) {
        super(adSoyad, eposta, telefon, bolum, gorev, ders);
        this.yuksekLisans = yuksekLisans;
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}

class Ogretim_Uyesi extends Akademisyen {
    String unvan;

    public Ogretim_Uyesi(String adSoyad, String eposta, String telefon, String bolum, String gorev, String ders, String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorev, ders);
        this.unvan = unvan;
    }

    public String giris() {
        return this.unvan + " " + super.giris();
    }
}

class Memur extends Calisan {
    private String departman, mesai;

    public Memur(String adSoyad, String eposta, String telefon, String departman, String mesai) {
        super(adSoyad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String giris() {
        return super.giris() + " B kapisindan";
    }

    public String cikis() {
        return super.cikis() + " B kapisindan";
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}

class Guvenlik_Gorevlisi extends Memur {
    String belge;

    public Guvenlik_Gorevlisi(String adSoyad, String eposta, String telefon, String departman, String mesai, String belge) {
        super(adSoyad, eposta, telefon, departman, mesai);
        this.belge = belge;
    }
}

class Bilgi_Islem extends Memur {
    String gorev;

    public Bilgi_Islem(String adSoyad, String eposta, String telefon, String departman, String mesai, String gorev) {
        super(adSoyad, eposta, telefon, departman, mesai);
        this.gorev = gorev;
    }
}


/* Siniflari tek bir dosyada yazarken public sadece main sinifinda olur
ayni metot ismi birden fazla yerde kullanilirsa metot ezme(methot overriding) olur. Alt sinifin metotu çalışır.
extend soluna yazilanin sagina yazilanin alt sinifi oldugunu belirtir.
super deyimi üst siniftan metot cagirmak gibi bir şey ama sadece metot degil degisken de cagrilabilir.
*/