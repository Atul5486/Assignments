import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter five number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        int num4=inp.nextInt();
        int num5=inp.nextInt();
        double avg=(double)((num1+num2+num3+num4+num5)/5);
        System.out.println("The average of five number is : "+avg);
    }
}