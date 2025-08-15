import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter mm : ");
        double mm=inp.nextDouble();
        double in=mm*0.0393701;
        System.out.println("In Inches : "+in);
    }
}