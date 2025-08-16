import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a 5 digit number : ");
        int num=inp.nextInt();
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse number of 5 digit is : "+rev);
    }
}