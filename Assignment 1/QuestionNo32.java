import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=inp.nextInt();
        System.out.println("Enter second number");
        int num2=inp.nextInt();
        int max = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        int min = (num1 + num2 - Math.abs(num1 - num2)) / 2;
        System.out.println("Maximum number is :"+max);
        System.out.println("Minimum number is :"+min);
    }
}