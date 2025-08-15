import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        String str=num%2==0 ? "Number is even ":"Number is odd";
        System.out.println(str);
    }
}