import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a=inp.nextInt();
        System.out.print("Enter second side : ");
        int b=inp.nextInt();
        System.out.print("Enter third side : ");
        int c=inp.nextInt();
        double s=(double)((a+b+c)/2);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        if(a+b==c || b+c==a || c+b==a)
        System.out.println("Sum of two side is not equal to third");
        else
        System.out.println("Area of triangle is : "+area);
       
    }
}