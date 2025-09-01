import java.util.Scanner;
class Main {
    static String perfect(int n){
        int perfect=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            perfect+=i;
        }
        return (n==perfect) ? "Number is perfect ":"Number is not perfect";
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=inp.nextInt();
        System.out.println(perfect(num));
    }
}