import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter marks of five subject");
        int marks1=inp.nextInt();
        int marks2=inp.nextInt();
        int marks3=inp.nextInt();
        int marks4=inp.nextInt();
        int marks5=inp.nextInt();
        float per=(float)((marks1+marks2+marks3+marks4+marks5)/5.0);
        if(per>=75 && per<=100)
        System.out.println("Grade A");
        else if(per>=60 && per<75)
        System.out.println("Grade B");
        else if(per>=50 && per<60)
        System.out.println("Grade C");
        else if(per>=33 && per<50)
        System.out.println("Grade D");
        else
        System.out.println("Fail");
    }
}