import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter two number");
       int num1=inp.nextInt();
       int num2=inp.nextInt();
       if(num1==num2)
       System.out.println("Both number are equal");
       else if(num1>num2)
       System.out.println("Num1 is greater");
       else
       System.out.println("Num2 is greater");
    }
}