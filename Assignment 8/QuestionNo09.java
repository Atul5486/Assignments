import java.util.Scanner;
class Employee{
    private int empid;
    private double salary;
    private String name;
    Employee(int empid,String name,double salary){
        this.name=name;
        this.salary=salary;
        this.empid=empid;
    }
    double calcTax(){
        return salary-(salary*12.5/100);
    }
    public double empSalary(){
        return salary;
    }
    public String empName(){
        return name;
    }
    void display(){
        System.out.println("\nId of employee : "+empid);
        System.out.println("Name of employee : "+name);
        System.out.println("Salary of employee : "+salary);
        System.out.println("Salary after tax(12.5%) : "+calcTax());
    }
    public static Employee max(Employee e1, Employee e2) {
        if (e1.salary > e2.salary)
            return e1;
        else
            return e2;
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Employee emp[]=new Employee[2];
        for(int i=0;i<emp.length;i++){
            System.out.println("Enter id of employee "+(i+1));
            int id=inp.nextInt();
            inp.nextLine();
            System.out.println("Enter name of employee");
            String name=inp.nextLine();
            System.out.println("Enter salary of employee");
            double salary=inp.nextDouble();
            emp[i]=new Employee(id,name,salary);
        }
        for(Employee elem:emp){
            elem.display();
        }
        System.out.println("\nEmployee with higher salary:");
        Employee maxEmp = Employee.max(emp[0], emp[1]);
        System.out.println("Name: " + maxEmp.empName());
        System.out.println("Salary: " + maxEmp.empSalary());
    }
}