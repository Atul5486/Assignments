import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter four number : ");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        int num4=inp.nextInt();
        if(num1 > num2 && num1>num3 && num1> num4)
        System.out.println("Num1 is greater");
        else if(num2 > num1 && num2 > num3 && num2 > num4)
        System.out.println("Num2 is greater");
        else if (num3>num1 && num3>num2 && num3> num4)
        System.out.println("Num3 is greater");
        else if (num4>num1 && num4>num2 && num4>num3)
        System.out.println("Num4 is greater");
        else
        System.out.println("Enter different numbers");
    }
}