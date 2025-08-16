import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int num=inp.nextInt();
        int temp=num,sum=0;
        double last=0;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=num;
        while(temp!=0){
          int rem=temp%10;
          last=Math.pow(rem,count);
          sum+=last;
          temp/=10;
        }
        System.out.println(sum);
        if(sum==num)
        System.out.println("Number is armstrong");
        else
        System.out.println("Number is not armstrong");
    }
}