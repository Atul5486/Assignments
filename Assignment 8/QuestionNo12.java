import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
           System.out.println("Enter num1");
           int num1=inp.nextInt();
           System.out.println("Enter num2");
           int num2=inp.nextInt();
        Calc num=new Calc(num1,num2);
        num.sum();
}
}
class Calc{
    private int num1;
    private int num2;
    Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void sum(){
        System.out.println("Sum of : "+this.num1+" + "+this.num2+" = "+(num1+num2));
    }
}