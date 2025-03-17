public class Book {
    private String name,author,publisher;
    private int numberOfPage;

    Book(String name,int numberOfPage,String author,String publisher){

        if (name == null || name.isEmpty()) {
            System.out.println("Hatali kitap ismi girişi");
        } else {
            this.name = name;
        }

        if(numberOfPage < 1){
            System.out.println("Sayfa sayisi negatif olamaz");
            this.numberOfPage = 10;
        }else{
            this.numberOfPage = numberOfPage;
        }

        if (author == null || author.isEmpty()) {
            System.out.println("Hatali yazar ismi girisi");
        } else {
            this.author = author;
        }

        if (publisher == null || publisher.isEmpty()) {
            System.out.println("Hatali yayinci girisi");
        } else {
            this.publisher = publisher;
        }

    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Hatali kitap ismi girişi");
        } else {
            this.name = name;
        }
    }


    public void setNumberOfPage(int numberOfPage) {
        if (numberOfPage < 1) {
            System.out.println("Sayfa sayisi pozitif olmali");
            numberOfPage = 10;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }
    public int getNumberOfPage() {
        return numberOfPage;
    }


    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            System.out.println("Hatali yazar ismi girisi");
        } else {
            this.author = author;
        }
    }


    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            System.out.println("Hatali yayinci girisi");
        } else {
            this.publisher = publisher;
        }
    }



        public static void main(String[] args){
            Book b1 = new Book("Harry Potter", 400, "Rowling", "ABC yayincilik");
            b1.setNumberOfPage(-100);
            System.out.println(b1.getNumberOfPage());
            b1.setPublisher("");
            System.out.println(b1.getPublisher());
            b1.setAuthor("");
            System.out.println(b1.getAuthor());
            b1.setName("");
            System.out.println(b1.getName());
        }
}
/*Bu kodda getter ve setter metotlarinin kullanimini gördüm.
getter cagrildiginda veriable'i getirir
setter ise cagrildiginda bir veriable alarak veriable'ı degistirmeye yarar
guvenligi artirmasindan dolayi bu yontemler kullanilir*/