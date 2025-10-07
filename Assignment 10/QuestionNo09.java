import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Runnable obj=new Runnable(){
            @Override
            public void run(){
                System.out.println("Enter a number");
                int num=inp.nextInt();
                boolean isPrime=true;
                if(num==1 || num==0)
                isPrime=false;
                for(int i=2;i<num/2;i++){
                    if(num%i==0){
                        isPrime=false;
                    }
                }
                if(isPrime)
                System.out.println(num+" is prime");
                else
                System.out.println(num+" is not prime");
            }
        };
        Thread th=new Thread(obj);
        th.start();
    }
}