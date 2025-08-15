import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter meter : ");
        int m=inp.nextInt();
        double ft=m*3.28;
        System.out.println("In feet : "+ft);
    }
}