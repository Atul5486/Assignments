import java.io.*;
class Transaction{
    String name;
    int bal;
    int credited=0,debited=0;
    Transaction(String name,int bal){
        this.name=name;
        this.bal=bal;
    }
    String creditedAmount(int amt){
        credited++;
        bal+=amt;
        return ("Credited Amount "+amt+"\tTotal Amount "+(bal));
    }
    String debitedAmount(int amt){
        debited++;
        bal-=amt;
        return ("Debited Amount "+amt+"      Total Amount "+(bal));
    }
}
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\transaction.txt");
        String data;
        Transaction tre=new Transaction("Peter",10000);
        try(FileWriter fw=new FileWriter(file,true);){
        data=tre.creditedAmount(1000);
            fw.write(data+"\n\n");
        data=tre.debitedAmount(100);
            fw.write(data+"\n\n");
            System.out.println("Transaction add Successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
       System.out.println("Total Credit : "+tre.credited);
       System.out.println("Total debit : "+tre.debited);
    }
}