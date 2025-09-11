import java.util.Scanner;
class BankAccount{
    double balance;
    BankAccount(){
        balance=0;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        balance-=amount;
    }
    double getBalance(){
        return balance;
    }
}
class SavingAccount extends BankAccount{
    double rate;
    double minBal;
    SavingAccount(double rate,double minBal){
        this.rate=rate;
        this.minBal=minBal;
    }
    void setInterestRate(double rate){
        this.rate=rate;
        if(getBalance()>=minBal){
            deposit(getBalance()*rate/100);
        }
    }

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        SavingAccount sc=new SavingAccount(5.5,2000);
        System.out.println("Current balance : "+sc.getBalance());
        System.out.println("Enter amount to deposit");
        double amtD=inp.nextDouble();
        sc.deposit(amtD);
        System.out.println("Balance after deposite: "+sc.getBalance());
        sc.setInterestRate(5.5);
        System.out.println("Current balance after intrest: "+sc.getBalance());
    }
}