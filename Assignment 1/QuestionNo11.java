import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=inp.nextInt();
        System.out.print("Enter second number : ");
        int b=inp.nextInt();
       System.out.println("Greater : "+(a>b));
       System.out.println("Less : "+(a<b));
       System.out.println("Equal : "+(a==b));
       System.out.println("Not equal : "+(a!=b));
       System.out.println("Greater than or equal to : "+(a>=b));
       System.out.println("Less than or equal to : "+(a<=b));
    }
}