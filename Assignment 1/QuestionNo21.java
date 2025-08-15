import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter second number : ");
        int num2=inp.nextInt();
        String str=(num1>num2)? "Num1 is greater":(num1<num2) ? "Num2 is greater" : "Both are equal";
        System.out.println(str);
    }
}