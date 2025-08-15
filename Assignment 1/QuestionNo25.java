import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Heigth in inches : ");
        int in=inp.nextInt();
        double cm=in*2.54;
        System.out.println("In cm : "+cm);
    }
}