import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter celsius : ");
        float c=inp.nextFloat();
        float f=c*9/5 + 32 ;
        System.out.println("Celsius to fahrenheit : "+f);
        }
}