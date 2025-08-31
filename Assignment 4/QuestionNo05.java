import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter C Area of circle \nS Area of square \nR Area of rectangle \nT Area of trapezium");
        char ch=inp.next().toUpperCase().charAt(0);
        switch(ch){
        case 'C':
               System.out.println("Enter radius of circle");
               int r=inp.nextInt();
               System.out.println("Area of circle is : "+(Math.PI*r*r));
               break;
        case 'S':
               System.out.println("Enter side of square");
               int s=inp.nextInt();
               System.out.println("Area of square is : "+(s*s));
               break;
        case 'R':
               System.out.println("Enter Length and breadth of reactangle");
               int len=inp.nextInt();
               int bre=inp.nextInt();
               System.out.println("Area of reactangle is : "+(len*bre));
               break;   
        case 'T':
               System.out.println("Enter height of trapezium");
               int h=inp.nextInt();
               System.out.println("Enter value of a and b");
               int a=inp.nextInt();
               int b=inp.nextInt();
               System.out.println("Area of trapezium is : "+(0.5*h*(a+b)));
               break;
            default:
            System.out.println("Invaild choice");
        }
    }
}