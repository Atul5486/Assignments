class Bank{
    static Account ac;
   void createAccount(String name,int accno,int bal){
       ac=new Account(name,accno,bal);
    }
   static String transactions[]=new String[20];  
   static int count=0;
    void withdraw(int amt){
        if(amt>ac.bal){
            System.out.println("\nInsufficient Fund");
        }else{
            System.out.println("\nCurrent balance : "+ac.bal);
            System.out.println("Withdraw amount : "+amt);
            System.out.println("Current balance : "+(ac.bal-amt));
            ac.bal-=amt;
            transactions[count++]="Amount withdraw "+amt;
        }

    }
    void deposit(int amt){
        System.out.println("\nDeposite amount : "+amt);
        System.out.println("Current balance : "+(ac.bal+amt));
        ac.bal+=amt;
            transactions[count++]="Amount Deposite "+amt;
        }
void display(){
    ac.details();
    }
    class Account{
        String name;
        int accno,bal;
        Account(String name,int accno,int bal){
           this.name=name;
           this.bal=bal;
           this.accno=accno;
        }
        void details(){
            System.out.println("\nAccount holder Name : "+name);
            System.out.println("Account number : "+accno);
            System.out.println("Current balance : "+bal);
        }  
    }
    static class AuditTrail{
        static void allTransactions(){
            System.out.println("\nAccount Transaction History");
            for(int i=0;i<count;i++){
                System.out.println(transactions[i]);
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
    Bank acc=new Bank();
    acc.createAccount("Peter ",1010101,10000);
    acc.display();
    acc.withdraw(20000);
    acc.deposit(100000);
    acc.withdraw(20000);
    Bank.AuditTrail.allTransactions();
    }
}