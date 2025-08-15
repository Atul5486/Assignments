import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter second number : ");
        int num2=inp.nextInt();
        if(num1==num2)
        System.out.println("Both are equal");
        else if(num1>num2)
        System.out.println("Num1 is greater");
        else
        System.out.println("Num2 is greater");
    }
}