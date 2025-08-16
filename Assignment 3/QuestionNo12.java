import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        if(num>0)
        System.out.println("Number is Positive");
        else if(num<0)
        System.out.println("Number is Negative");
        else
        System.out.println("Number is zero");
    }
}