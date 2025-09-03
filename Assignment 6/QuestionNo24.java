import java.util.Scanner;
class Main {
    static int sum(int n){
        int sum=0;
       for(int i=1;i<=n;i++){
           sum+=i;
       }
       return sum;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        System.out.println("Sum of n numbers is :"+sum(num));
       
    }
}