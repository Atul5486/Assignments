import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        TCSEmployee emp1=new TCSEmployee();
        emp1.setData();
        emp1.display();
        TCSEmployee emp2=new TCSEmployee();
        emp2.setData();
        emp2.display();
        
    }
}
class TCSEmployee{
    public static Scanner inp=new Scanner(System.in);
    private int eid;
    private String name;
    private int salary;
    private String companyName;
    static{
    companyName="TCS";
    }
    void setData(){
        System.out.println("Enter employee id");
        eid=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter employee name");
        name=inp.nextLine();
        System.out.println("Enter employee salary");
        salary=inp.nextInt();
    }
    void display(){
        System.out.println("-------------------------");
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: $" + this.salary);
        System.out.println("-------------------------");
    }
}