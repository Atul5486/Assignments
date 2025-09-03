import java.util.Scanner;
class Main {
    static String greater(int num1,int num2,int num3){
        String str=(num1!=num2 || num2!=num3) ? (num1>num2 && num1>num3) ? "Num1 is greater" : (num2>num1 && num2>num3) ?"Num2 is greater ": "Num3 is greater": "All are equal";
        return str;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter three number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        System.out.println(greater(num1,num2,num3));
    }
}