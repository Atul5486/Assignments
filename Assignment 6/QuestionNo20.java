import java.util.Scanner;
class Main {
    static String leap(int year){
        String str = (year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? "Leap year" : "Not a leap year"): "Leap year"): "Not a leap year";

        return str;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=inp.nextInt();
        System.out.println(leap(year));
    }
}