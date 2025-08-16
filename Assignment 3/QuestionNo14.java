import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=inp.nextInt();
        System.out.println("Enter second number");
        int num2=inp.nextInt();
        if(num1%num2==0)
        System.out.println("Num1 is divisible by num2");
        else
        System.out.println("Num1 is not divisible by num2");
    }
}