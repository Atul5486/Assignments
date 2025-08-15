import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter marks of first subject : ");
        int m1=inp.nextInt();
        System.out.print("Enter marks of second subject : ");
        int m2=inp.nextInt();
        System.out.print("Enter marks of third subject : ");
        int m3=inp.nextInt();
        System.out.print("Enter marks of fourth subject : ");
        int m4=inp.nextInt();
        System.out.print("Enter marks of fifth subject : ");
        int m5=inp.nextInt();
        int total=m1+m2+m3+m4+m5;
        System.out.println("Total marks is : "+total);
        float per=(float)(total/5f);
        System.out.println("The percentage is : "+per);
    }
}