import java.util.Scanner;
class Main {
    static double ci(int p,double r,int t){
        return (double) (p*Math.pow((1+r/100),t))-p;
    }
    static double si(int p,double r,int t){
        return (double) (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter principle amount");
        int p=inp.nextInt();
        System.out.println("Enter rate of intrest (in %)");
        double r=inp.nextDouble();
        System.out.println("Enter time");
        int t=inp.nextInt();
        if(p>=500){
            System.out.println("Compound intrest is : "+ci(p,r,t));
        }else{
            System.out.println("Simple intrest is : "+si(p,r,t));
        }
       
    }
}