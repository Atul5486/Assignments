import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Three number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        String str=(num1>num2 && num1>num3)? "Num1 is greater":(num2>num1 && num2>num3) ? "Num2 is greater" : (num3>num1 && num3>num2)? "Num3 is greater":"Any two are equal" ;
        System.out.println(str);
    }
}