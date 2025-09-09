import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
           System.out.println("Enter num1");
           int num1=inp.nextInt();
           System.out.println("Enter num2");
           int num2=inp.nextInt();
        Numberc num=new Numberc(num1,num2);
        num.displayNum1();
        num.displayNum2();
}
}
class Numberc{
    private int num1;
    private int num2;
    Numberc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void displayNum1(){
        System.out.println("Value of num1 is : "+this.num1);
    }
     void displayNum2(){
        System.out.println("Value of num2 is : "+this.num2);
    }
}