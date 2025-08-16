import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number in five digit : ");
        int num=inp.nextInt();
        int sum=0,count=0;
        if(num>=100000 && num<=999999){
        while(num!=0){
            count++;
            int rem=num%10;
            num/=10;
            if(count==1 || count==6){
                sum+=rem;
            }
            }
        System.out.println("Sum of first and last digit is : "+sum);
        }else
        System.out.println("Enter a six digit number");
    }
}