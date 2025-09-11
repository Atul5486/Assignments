import java.util.Scanner;
class MathOperation{
    private double x,y,r=0;
    private char op;

    void init(double x,double y,char op){
        this.x=x;
        this.y=y;
        this.op=op;
    }
    void add(){
        this.r=this.x+this.y;
    }
    void multiply(){
        r=x*y;
    }
    void power(){
        r=Math.pow(x,y);
    }
    void display(){
            switch(op){
            case '+':add();System.out.println("Result : "+r);break;
            case '*':multiply();System.out.println("Result : "+r);break;
            case 'p':power();System.out.println("Result : "+r);break;
            default:System.out.println("Invalid choice");
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter value of x");
        double x=inp.nextDouble();
        System.out.println("Enter value of y");
        double y=inp.nextDouble();
        System.out.println("Enter operand to perform operation\n+.Addition\n*.Multiply\np.power");
        char op=inp.next().toLowerCase().charAt(0);
        MathOperation math=new MathOperation();
        math.init(x,y,op);
        math.display();
        
    }
}