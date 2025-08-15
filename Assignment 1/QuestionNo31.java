import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Number of days");
        int days=inp.nextInt();
        int day=days%7;
        double weeks=(double)(days/7);
        double year=(double)(days/365);
        System.out.println("Number od days : "+day +"\nNumber of weeks "+weeks + " \nNumber of years "+year);
    }
}