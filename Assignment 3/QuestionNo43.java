import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double a,b,c;
        double root1,root2;
        System.out.println("Enter the coffiecent of quadratic equation");
        System.out.print("Enter a: ");
        a=inp.nextDouble();
        System.out.print("Enter b: ");
        b=inp.nextDouble();
        System.out.print("Enter c: ");
        c=inp.nextDouble();
        double dis= b*b-4*a*c;
        if(dis>0){
             root1 = (-b + Math.sqrt(dis)) / (2 * a);
            root2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("The roots are real and distinct");
            System.out.println("Root 1 : "+root1);
            System.out.println("Root 2 : "+root2);
        }else if(dis==0){
            root1=root2=-b/(2*a);
            System.out.println("The roots are real and equal");
            System.out.println("Root : "+root1);
        }else{
            double real = -b / (2 * a);
            double img = Math.sqrt(-dis)/(2*a);
            System.out.println("The roots are complex and distinct:");
            System.out.println("Root 1 : "+real+" "+img);
            System.out.println("Root 2 : "+real+" "+img);
        }
        
    }
}