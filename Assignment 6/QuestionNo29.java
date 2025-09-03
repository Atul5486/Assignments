import java.util.Scanner;
class Main {
    static void fibo(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+b;  
            b=a-b;
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of term");
        int num=inp.nextInt();
        fibo(num);
    }
}