/* 30.Create a class Employee with one data member(name).Declare the member function 
a)Employee() :- initializes the data member.
b)getName() :- which gets the name. 
c)setName() :- which sets the name. 
d)pay(int hours_worked)

Create a class HourlyEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee.

Create a class SalariedEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee.
*/
import java.util.Scanner;
class Employee{
    private String name;
    Employee(){
        name="user";
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    double pay(int hour) {
        return 0.0;
    }
}
class HourlyEmployee extends Employee{
    private int wages;
    HourlyEmployee(String name,int wages){
        setName(name);
        this.wages=wages;
    }
    @Override
    double pay(int hour){
      return wages * hour;
    }

}
class SalariedEmployee extends Employee{
        private int monthlyS;
        SalariedEmployee(String name,int monthlyS){
        setName(name);
        this.monthlyS=monthlyS;
    }
    @Override
    double pay(int hour){
        double rate=(double)monthlyS/160;
        return hour*rate;
    } 
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter name of employee");
        String name=inp.nextLine();
        System.out.println("Enter working hour");
        int hour=inp.nextInt();
        System.out.println("Enter rate ");
        int rate=inp.nextInt();
        HourlyEmployee emp1=new HourlyEmployee(name,hour);
        System.out.println("\nEmployee name : "+emp1.getName());
        System.out.println("Hourly salary of  employee: "+emp1.pay(rate));
        inp.nextLine();
         System.out.println("\nEnter name of employee");
        name=inp.nextLine();
        System.out.println("Enter monthly salary");
        rate=inp.nextInt();
        System.out.println("Enter rate per hour");
        hour=inp.nextInt();
        SalariedEmployee emp2=new SalariedEmployee(name,hour);
        System.out.println("\nEmployee name : "+emp2.getName());
        System.out.println("Monthly salary of employee: "+emp2.pay(rate));
    }
}