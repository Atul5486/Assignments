import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=inp.nextInt();
        System.out.print("Enter second number : ");
        int b=inp.nextInt();
       System.out.println("Addition : "+(a+b));
       System.out.println("Substraction : "+(a-b));
       System.out.println("Multiplication : "+(a*b));
       System.out.println("Divide : "+(a/b));
       System.out.println("Modules : "+(a%b));
    }
}