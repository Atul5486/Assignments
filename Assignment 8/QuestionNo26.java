/* 
Create a class Manager with one data member is_salaried (which should be in the form of 0(false) or 1(true).
Declare one member function
a)int is_salaried() :- which returns whether the manager is salaried or not. b)showDetail() :- it display the entire detail of a employee.*/
import java.util.Scanner;
class Employee{
    Scanner inp=new Scanner(System.in);
    protected String name;
    protected float payRate;
    void getName(){
        System.out.println("Enter name");
        name=inp.nextLine();
    }
    void getPay(){
        System.out.println("Enter salary");
        payRate=inp.nextFloat();
    }
}
class Manager extends Employee{
    Scanner inp=new Scanner(System.in);
    private int is_salaried;
    int salaried(){
        System.out.println("Enter is salaried (0 or 1)");
        is_salaried=inp.nextInt();
        return is_salaried;
    }
    int check=salaried();
    String str=(check==1) ? "Salaried":"Not salaried";
    void showDetail(){
        System.out.println("\n====== Employee details =======");
        System.out.println("Name    : "+name);
        System.out.println("Salary  : "+payRate);
        System.out.println(str);
    }
    public static void main(String args[]){
        Manager mr=new Manager();
        mr.getName();
        mr.getPay();
        mr.showDetail();
    }
}