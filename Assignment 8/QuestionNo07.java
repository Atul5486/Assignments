/*  7.Store six user’s account information using class created in above problem and calculate
-total money deposited in all accounts
-list all account number with balance greater than 1000*/
import java.util.Scanner;
class Account{
    public static Scanner inp=new Scanner(System.in);
        private int accno;
        private String name;
        private double bal;
        double deposit=bal;
        static double total=0;
        public double getBal(){
            return bal;
        }
        public String cname(){
            return name;
        }
        void getdata(int i){
        System.out.println("Enter account number of "+(i+1));
        accno=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter full name ");
        name=inp.nextLine();
        System.out.println("Enter a balance ");
        bal=inp.nextDouble();
        }
        void display(){
            System.out.println("\n====== Account details ======");
            System.out.println("Account number : "+accno);
            System.out.println("Account Holder name : "+name);
            System.out.println("Current balance : "+bal);
        }

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Account obj[]=new Account[6];
        double total=0;
        for(int i=0;i<obj.length;i++){
            obj[i]=new Account();
            obj[i].getdata(i);
        }
        for(int i=0;i<obj.length;i++){
            obj[i].display();
            double bal=obj[i].getBal(); 
            total+=bal;      
        }
        for(int i=0;i<obj.length;i++){
        if(obj[i].getBal()>=1000){
            System.out.println("\nAccount holder who have more than 1000 in their account");
            System.out.println("Account holder name: "+obj[i].cname());
            check=true;
        }
        }
        System.out.println("\nTotal deposite amount is : "+total);
    }
}
