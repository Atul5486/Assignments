import java.util.Scanner;
class Main {
    static String greater(int num1,int num2){
        String str=(num1!=num2) ? (num1>num2) ? "Num1 is greater" : "Num2 is greater" : "Both are equal";
        return str;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter two number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        System.out.println(greater(num1,num2));
    }
}