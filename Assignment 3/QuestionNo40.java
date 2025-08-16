import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a digit number: ");
        int num=inp.nextInt();
        int temp=num,rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(rev==num)
        System.out.println("Number is palindrome");
        else
        System.out.println("Number is not palindrome");
    }
}