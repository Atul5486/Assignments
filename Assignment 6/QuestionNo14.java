import java.util.Scanner;
class Main {
    static double si(int p,double r,int t){
        return (double)(p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter principle amount");
       int p=inp.nextInt();
       System.out.println("Enter rate of intrest (in %)");
       double r=inp.nextDouble();
       System.out.println("Enter time");
       int t=inp.nextInt();
        System.out.println("Simple intrest is : "+si(p,r,t));
    }
}