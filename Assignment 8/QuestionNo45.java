import java.util.Scanner;
class Bank{
    Scanner inp=new Scanner(System.in);
    private String name,branch="Indore";
    private int accno;
    private double bal;
    String type="";
    String transaction[]=new String[20];
    int count=0;
    Bank(){
        System.out.println("Select account opening type\n1.Saving\n2.Current");
        int ch=inp.nextInt();
        do{
        if(ch==1){
            type="Saving";
        }else if(ch==2){
            type="Current";
        }else{
            System.out.println("Invalid choice| Try again");
            ch=inp.nextInt();
        }
        }while(ch<1||ch>2);
        inp.nextLine();
        System.out.println("\nCustomer Details");
        System.out.println("Enter customer name");
        name=inp.nextLine();
        System.out.println("Enter account number");
        accno=inp.nextInt();
        if(type.matches("Saving")){
        System.out.println("Enter minimum balance (5000)");
        bal=inp.nextDouble();
        if(bal<5000){
        do{
            System.out.println("Minimum balance is low | Try again");
            bal=inp.nextDouble();
        }while(bal<5000);
        }
        }else{
        System.out.println("Enter minimum balance (1000)");
        bal=inp.nextDouble();
        if(bal<1000){
        do{
            System.out.println("Minimum balance is low | Try again");
            bal=inp.nextDouble();
        }while(bal<1000);
        }
        }
        show();

    }
    void show(){
        System.out.println("\nCustomer Details");
        System.out.println("Account holder name : "+name);
        System.out.println("Account No : "+accno);
        System.out.println("Branch Name : "+branch);
        System.out.println("Account Type : "+type);
        System.out.println("Current balance : "+bal);
    }
    void withdraw(){
        System.out.println("Enter withdraw amount excluding min balance");
        int amt=inp.nextInt();
        if(amt<=bal+5000){
            bal-=amt;
            System.out.println("Current balance : "+bal);
            transaction[count++]=amt+" Amount withdraw ";
        }else System.out.println("Insufficient Balance");

    }
    void deposit(){
        System.out.println("Enter deposit amount");
        int amt=inp.nextInt();
        if(amt>0){
            bal+=amt;
            System.out.println("Current balance : "+bal);
            transaction[count++]=amt+" Amount Deposit ";
        }else{
            System.out.println("Deposit amount never in minus");
        }
    }
    void transaction(){
        System.out.println("\nShowing transaction history");
        for(int i=0;i<=count;i++){
            System.out.println(transaction[i]);
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Press 1 for creating account");
        int ch=inp.nextInt();

        switch(ch){
        case 1:
        Bank customer=new Bank();
        int se;
        do{
        System.out.println("\nEnter your choice \n1.Withdraw\n2.Deposit\n3.Show Details\n4.Show transaction\n5.Existing");
        se=inp.nextInt();
        switch(se){
            case 1:customer.withdraw();break;
            case 2:customer.deposit();break;
            case 3:customer.show();break;
            case 4:customer.transaction();break;
            case 5:System.out.println("Existing");break;
            default:System.out.println("Invalid choice");
        }
        }while(se!=5);
        break;
        default:System.out.println("Invalid choice");
        }
        
    }
}