import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        if(num>=50 && num<=100)
        System.out.println("Number is lies between 50 and 100");
        else
        System.out.println("Number is not lies between 50 and 100");
    }
}