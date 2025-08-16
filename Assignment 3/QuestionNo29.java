import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Basic salary : ");
        int salary=inp.nextInt();
        double ta=(double)(salary*10/100.0);
        double pf=(double)(salary*7.8/100.0);
        int da=500;
        double gs=(double)(salary+da+ta);
        double ns=gs-pf;
        System.out.println("Basic salary is : "+salary);
        System.out.println("Travel allowance is : "+ta+"\nProvident  fund is : "+pf);
        System.out.println("Gross salary is : "+gs);
        System.out.println("Net salary is : "+ns);
        
    }
}