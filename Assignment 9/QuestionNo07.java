/* 7. Library Catalog
Create a class Library with a nested class Book. Each book should have a title, author, and genre. The outer class should:
•	Add books to the catalog
•	Search books by genre
•	Display all books
Include a static nested class LibraryUtils to:
•	Sort books alphabetically
•	Count books by genre
*/
class Bank{
    static Account ac;
   void createAccount(String name,int accno,int bal){
       ac=new Account(name,accno,bal);
    }
    void withdraw(int amt){
        if(amt>ac.bal){
            System.out.println("\nInsufficient Fund");
        }else{
            System.out.println("\nCurrent balance : "+ac.bal);
            System.out.println("Withdraw amount : "+amt);
            System.out.println("Current balance : "+(ac.bal-amt));
            ac.bal-=amt;
        }

    }
    void deposit(int amt){
        System.out.println("\nDeposite amount : "+amt);
        System.out.println("Current balance : "+(ac.bal+amt));
        ac.bal+=amt;
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
}
class Main {
    public static void main(String[] args) {
    }
}