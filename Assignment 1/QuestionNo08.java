import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter principle amount : ");
        int p=inp.nextInt();
        System.out.print("Enter rate of interest : ");
        float r=inp.nextFloat();
        System.out.print("Enter time : ");
        int t=inp.nextInt();
        double amount=p*Math.pow((1+r/100),t);
        double ci=amount-p;
        System.out.println("The compound interest is : "+ci);
       
    }
}