import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter feet : ");
        double ft=inp.nextDouble();
        double m=ft/3.28;
        System.out.println("In meter : "+m);
    }
}