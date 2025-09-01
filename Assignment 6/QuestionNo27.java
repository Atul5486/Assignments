import java.util.Scanner;
class Main {
    static void factor(int n){
        System.out.print("Factor of "+n+" is : ");
       for(int i=1;i<=n/2;i++){
           if(n%i==0)
           System.out.print(i+" ");
       }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
       factor(num); 
    }
}