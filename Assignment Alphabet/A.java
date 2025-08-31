import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int temp=num;
        int count=0;
        int sum=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=num;
        while(temp!=0){
            int rem=temp%10;
            sum+=Math.pow(rem,count);
            temp/=10;
        }
        if(sum==num)
        System.out.println("Number is armstrong");
        else
        System.out.println("Number is not armstrong");

    }
}