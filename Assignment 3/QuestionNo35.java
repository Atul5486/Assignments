import java.util.Scanner; 
class Main {
    static int sum(int num){
        int sum=0;
         while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        int num=inp.nextInt();
       while(num>9)
       num=sum(num);
       System.out.println("One digit sum is : "+num);       
    }
}