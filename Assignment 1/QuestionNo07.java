import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter radius of cylinder : ");
        int r=inp.nextInt();
        System.out.print("Enter height of cylinder : ");
        int h=inp.nextInt();
       double area=(double)(Math.PI*r*r*h);
       System.out.println("Area of cylinder is : "+area);
    }
}