import java.util.Scanner;
class Main {
     public static Scanner inp=new Scanner(System.in);
    static void showChoice(int num1,int num2){
     System.out.println("Enter your choice to perform arithmetic operation");
        System.out.println("+.Addition\n-.Substraction\n*.Multiplication\n/.Divide");
        char ch=inp.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Addition : "+add(num1,num2));break;
            case '-':System.out.println("Substraction : "+subtract(num1,num2));break;
            case '*':System.out.println("Multiplication : "+mulitiply(num1,num2));break;
            case '/':System.out.println("Divide : "+divide(num1,num2));break;
            default:System.out.println("Invalid choice");
        }
    }
    static int add(int num1,int num2){
        return num1+num2;
    }
    static int subtract(int num1,int num2){
        return num1-num2;
    }
    static int mulitiply(int num1,int num2){
        return num1*num2;
    }
    static double divide(int num1,int num2){
        return (double) num1/num2;
    }
public static void main(String[] args) {
        System.out.println("Enter two number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        showChoice(num1,num2);
    }
}