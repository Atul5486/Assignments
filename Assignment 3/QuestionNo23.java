import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amount=inp.nextInt();
        int count=0;
        if(amount>=500){
        count=amount/500;
        amount%=500;
        System.out.println("500 Note :"+count);
        }
        if(amount>=200){  
        count=amount/200;
        amount%=200;
        System.out.println("200 Note : "+count);
        }
        if(amount>=100){  
        count=amount/100;
        amount%=100;
        System.out.println("100 Note : "+count);
        }
        if(amount>=50){  
        count=amount/50;
        amount%=50;
        System.out.println("50 Note : "+count);
        }
       if(amount>=20){  
        count=amount/20;
        amount%=20;
        System.out.println("20 Note : "+count);
        }
        if(amount>=10){  
        count=amount/10;
        amount%=10;
        System.out.println("10 Note : "+count);
        }
        if(amount>=5){  
        count=amount/5;
        amount%=5;
        System.out.println("5 Coin : "+count);
        }
        if(amount>=2){  
        count=amount/2;
        amount%=2;
        System.out.println("2 Coin : "+count);
        }
        if(amount==1)
        System.out.println("1 Coin : "+amount);
    }
}