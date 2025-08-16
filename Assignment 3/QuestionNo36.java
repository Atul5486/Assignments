import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        int num=inp.nextInt();
        int min=9,max=0;
        while(num!=0){
            int rem=num%10;
            if(rem>max) max=rem;
            if(rem<min) min=rem;
            num/=10;
        }
       System.out.println("Greatest number is : "+max); 
       System.out.println("Smallest number is : "+min); 
    }
}