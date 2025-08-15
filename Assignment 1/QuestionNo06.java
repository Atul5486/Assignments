import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1=inp.nextInt();
        System.out.print("Enter second number : ");
        int n2=inp.nextInt();
       n1=n1+n2;
       n2=n1-n2;
       n1=n1-n2;
       System.out.println("n1: "+n1+" n2:"+n2);
    }
}