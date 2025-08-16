import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        if(num%2==0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
    }
}