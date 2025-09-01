import java.util.Scanner;
class Main {
    static int fact(int n){
        if(n==1)
        return 1;
        return n*(fact(n-1));
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
       System.out.println("Factorial is : "+fact(num)); 
    }
}