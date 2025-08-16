import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Principle amount");
        int p=inp.nextInt();
        System.out.println("Enter rate of intrest");
        double r=inp.nextFloat();
        System.out.println("Enter time");
        int t=inp.nextInt();
       double si = (p <= 500) ? (p*r*t)/100 : p*Math.pow(1+r/100,t);
       String str=(p>500) ? "Compound intrest is : "+(si-p) :"Simple intrest is : "+si;
       System.out.println(str);
    }
}