import java.util.Scanner;
interface Taxable{
    int salesTax=7;
    double incomeTax=10.5;
    void calcTax();
}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;
    Employee(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter employee id ");
        empId=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter employee name ");
        name=inp.nextLine();
        System.out.println("Enter employee salary ");
        salary=inp.nextDouble();
    }
    @Override
   public  void calcTax(){
    System.out.println("Tax on yearlt salary "+(salary*12*incomeTax)/100.0);       
 }
}
class Product implements Taxable{
    int pid,qty;
    double price;
    Product(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter product id ");
        pid=inp.nextInt();
        System.out.println("Enter product price ");
        price=inp.nextDouble();
        System.out.println("Enter product quantity ");
        qty=inp.nextInt();
    }
    @Override
    public void calcTax(){
        System.out.println("Tax on unit price is "+(price*salesTax)/100);
    }
}
class Main{
    public static void main(String args[]){
        Employee emp=new Employee();;
        emp.calcTax();
        Product pro=new Product();
        pro.calcTax();
    }
}