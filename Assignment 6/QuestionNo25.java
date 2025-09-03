import java.util.Scanner;
class Main {
    static void table(int n){
        System.out.println("\nTable of "+n+"\n");
       for(int i=1;i<=10;i++)
          System.out.println(n+" * "+i+" = "+(n*i));
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
       table(num); 
    }
}