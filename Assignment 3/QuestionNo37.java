import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Bijli bill unit : ");
        int unit=inp.nextInt();
        int amount=0;
        if(unit>300){  
            amount+=(unit-300)*5;
            unit=300;
        }
        if(unit>200 && unit<=300){  
            amount+=(unit-200)*4;
            unit=200;
        }
        if(unit >100 && unit <=200){
            amount+=(unit-100)*3;
            unit=100;
        }
        amount+=unit*2;
        System.out.println("Total amount : "+amount);
    }
}