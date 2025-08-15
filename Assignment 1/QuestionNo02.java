import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Principle amount : ");
        int p=inp.nextInt();
        System.out.print("Enter rate of intrest : ");
        int r=inp.nextInt();
        System.out.print("Enter time : ");
        int t=inp.nextInt();
        double si=(double)((p*r*t)/100);
        System.out.println("Simple intrest is : "+si);
    }
}