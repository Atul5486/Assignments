import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        int num=inp.nextInt();
        int even=0,odd=0;
        while(num!=0){
            int rem=num%10;
            if(rem%2==0)
            even++;
            else
            odd++;
            num/=10;
        }
        System.out.println("Number of even digit is : "+even+"\nNumber of odd digit is : "+odd);
    }
}