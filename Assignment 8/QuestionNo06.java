import java.util.Scanner;
class Account{
    public static Scanner inp=new Scanner(System.in);
        private int accno;
        private String name;
        private double bal;

        void getdata(int accno,String name,double bal){
            this.accno=accno;
            this.name=name;
            this.bal=bal;
        }
        void deposit(){
            System.out.println("\nEnter deposit amount");
            int dep=inp.nextInt();
            bal+=dep;
        }
        void withdraw(){
            System.out.println("\nYour current balance is : "+bal);
            System.out.println("Enter withdraw amount");
            int wid=inp.nextInt();
            if(wid<=bal) bal-=wid;
            else System.out.println("Insufficient fund");
        }
        void display(){
            System.out.println("\nAccount number : "+accno);
            System.out.println("Account Holder name : "+name);
            System.out.println("Current balance : "+bal);
        }

}
class Main{
    public static void main(String args[]){
        Account obj=new Account();
        obj.getdata(1010101,"Andrew Anderson",2000);
        obj.display();
        obj.deposit();
        obj.display();
        obj.withdraw();
        obj.display();
    }
}
