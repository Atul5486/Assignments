import java.util.Scanner;
class Main {
    static double temp(double f){
        return (double)(f - 32) * 5/9 ;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter temperature in fahrenheit");
       double f=inp.nextDouble();
        System.out.println("Celsius : "+temp(f));
    }
}