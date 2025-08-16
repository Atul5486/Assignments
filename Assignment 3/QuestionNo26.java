import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number in five digit : ");
        int num=inp.nextInt();
        int sum=0;
        if(num<=99999){
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum fo all digit is : "+sum);
        }else
        System.out.println("Enter a five digit number");
    }
}