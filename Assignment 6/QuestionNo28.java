import java.util.Scanner;
class Main {
    static String prime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            isPrime=false;
        }
        return (isPrime) ? "Prime number":"Not a prime number";
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
       System.out.println(prime(num)); 
    }
}