import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a year");
       int year=inp.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
            System.out.println("year is a leap year");
            else
            System.out.println("Year is not a leap year");
            }else
            System.out.println("Year is a leap year");
        }
        else
        System.out.println("Year is not a leap year");
    }
}