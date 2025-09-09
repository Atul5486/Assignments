import java.util.Scanner;
class Student{
   private int admno;
   private String sname;
   private float eng, math, science;
   private float total=0;
   void takeData(int admno,String sname,int eng,int math,int science){
       this.admno=admno;
       this.sname=sname;
       this.eng=eng;
       this.math=math;
       this.science=science;
       ctotal();
   }
   void display(){
       System.out.println("\n=============== Student Details ===============");
       System.out.println("Admission id is : "+admno);
       System.out.println("Name of student : "+sname);
       System.out.println("Marks of english : "+eng);
       System.out.println("Marks of Maths : "+math);
       System.out.println("Marks of Science : "+science);
       System.out.println("Total marks is : "+total+"/300");
   }
   float ctotal(){
       return this.total+=eng+math+science;
   }
}
class Main {
public static void main(String[] args) {
    Student sc=new Student();
     Scanner inp=new Scanner(System.in);
     System.out.println("Enter admission no of student");
       int admno=inp.nextInt();
       inp.nextLine();
       System.out.println("Enter name of student");
       String sname=inp.nextLine();
       System.out.println("Enter english marks (0 to 100)");
       int eng=inp.nextInt();
       System.out.println("Enter math marks (0 to 100)");
       int math=inp.nextInt();
       System.out.println("Enter science marks (0 to 100)");
       int science=inp.nextInt();
    sc.takeData(admno,sname,eng,math,science);
    sc.display();
    }
}