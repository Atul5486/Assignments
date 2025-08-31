import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter symbol to perform arithmetic operation ");
        System.out.println("+ Addition\n- Substraction \n* Multiplication \n/ Divide \n% Modules");
        char ch=inp.next().charAt(0);
        System.out.println("Enter two number");
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        switch(ch){
           case '+':System.out.println("Addition is : "+(num1+num2));break;
           case '-':System.out.println("Substraction is : "+(num1-num2));break;
           case '*':System.out.println("Multiplication is : "+(num1*num2));break;
           case '/':System.out.println("Division is : "+(num1/num2));break;
           case '%':System.out.println("Modulas is : "+(num1%num2));break;
            default:
            System.out.println("Invaild choice");
        }
    }
}