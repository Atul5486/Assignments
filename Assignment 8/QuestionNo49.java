import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a numbers with spaces");
        String str=inp.nextLine();
        String strS[]=(str.split(" "));
        for(String s:strS){
            sum+=Integer.parseInt(s);
        }
        System.out.println("Sum of numbers in array "+sum);
    }
}