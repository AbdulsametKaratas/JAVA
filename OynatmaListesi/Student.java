public class Student {
    public  String name;
    public int id,point;
    private static int counter;

     Student(String name,int id,int point){
         this.name = name;
         this.id = id;
         this.point = point;
         Student.counter ++;
     }

     public void exit(){
         Student.counter --;
     }
     public static int howStudent(){
         return Student.counter;
     }

     public static double calcOverall(int[] arr){
         double overall = 0;
         for(int i = 0; i < arr.length; i ++){
             overall += arr[i];
         }
         return overall / arr.length;
     }

    public static void main(String[] args){
        System.out.println("Online Ogrenci Platformu : " + Student.howStudent());
        Student s1 = new Student("Ali",220,100);
        Student s2 = new Student("Ayşe",330,90);
        Student s3 = new Student("Mehmet",200,80);
        System.out.println("Online Ogrenci Platformu : " + Student.howStudent());

        int[] notlar = new int[3];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
        notlar[2] = s3.point;
        System.out.println(Student.calcOverall(notlar));

    }
}