import java.util.Scanner;
class Leap{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a year : ");
        int y=inp.nextInt();
         String str=((y%4==0 && y%100!=0)|| y%400==0) ? "is Leap year ":"is not a leap year";
         System.out.println(y+" "+str);
    }
}