import java.util.Scanner;
class Main {
    static void leap(int year){
       if(year%4==0){
           if(year%100==0){
               if(year%400==0){
                   System.out.println(year+" leap year");
               }
               else
               System.out.println(year+" not Leap year");
           }else
           System.out.println(year+" Leap year");
       }else
       System.out.println(year+" Not a leap year");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=inp.nextInt();
        leap(year);
    }
}