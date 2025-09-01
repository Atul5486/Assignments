import java.util.Scanner;
class Main {
    static double avg(int num1,int num2,int num3,int num4,int num5){
        return (double)(num1+num2+num3+num4+num5)/5;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter 5 number");
       int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        int num4=inp.nextInt();
        int num5=inp.nextInt();
        System.out.println("Average is : "+avg(num1,num2,num3,num4,num5));
    }
}