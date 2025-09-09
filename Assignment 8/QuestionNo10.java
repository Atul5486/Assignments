import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       Student stu[]=new Student[5];
       for(int i=0;i<stu.length;i++){
           System.out.println("Enter roll no");
           int rno=inp.nextInt();
           inp.nextLine();
           System.out.println("Enter name");
           String name=inp.nextLine();
           System.out.println("Enter fees");
           int fees=inp.nextInt();
            stu[i]=new Student(rno,fees,name);
       }
       stu[4].display();
    }
}
class Student{
    private int rno,fees;
    private String name;
    static int totalfees=0;
    Student(int rno,int fees,String name){
        this.rno=rno;
        this.fees=fees;
        this.name=name;
        this.totalfees+=fees;
    }
    void display(){
        System.out.println("Total collected fees is  : "+totalfees);
    }
}