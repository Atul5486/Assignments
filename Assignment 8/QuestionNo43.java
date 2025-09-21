import java.util.Scanner;
abstract class Processor{
    int data;

    Processor(int data){
        this.data=data;
    }

    void showData(){
        System.out.println("Data is : "+data);
    }
    abstract void process();
}
class Factorial extends Processor{
    Factorial(int num){
        super(num);
    }
    @Override
    void process(){
        int sum=1;
        for(int i=1;i<=data;i++){
            sum=i*sum;
        }
        System.out.println("Factorial of "+data+" is : "+sum);
    }
}
class Circle extends Processor{
    Circle(int rad){
        super(rad);
    }
    @Override
    void process(){
        System.out.println("Area of circle is : "+(Math.PI*data*data));
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your choice \n1.Factorial\n2.Area of circle");
        int ch=inp.nextInt();
        Processor p;
        int num;
        if(ch==1){
            System.out.println("Enter a number");
            num=inp.nextInt();
            p=new Factorial(num);
        }else if(ch==2){
            System.out.println("Enter a radius of circle");
            num=inp.nextInt();
            p=new Circle(num);
        }else {System.out.println("Invalid choice"); return ;}
        p.showData();
        p.process();
    }
}