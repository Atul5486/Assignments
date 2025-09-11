/* 35. Create a class Employee with(empNo ,salary and totalSalary) ) with following features.
a. Only parameterized constructor;
b. totalSalary always represent total of all the salaries of all employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using class method.
*/
class Employee{
    private  int empNo=0;
    private  int salary;
    private static int totalSalary;
    private static int totalEmployees = 0;

    Employee(int salary){
        this.salary=salary;
        empNo++;
        totalEmployees++;
        totalSalary+=salary;
    }
    public int getEmpNo() {
        return empNo;
    }
    public double getSalary() {
        return salary;
    }
    public static void displayTotals() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: " + totalSalary);
    }

}

class Main{
    public static void main(String args[]){
        Employee e1 = new Employee(5000);
        Employee e2 = new Employee(7000);
        Employee e3 = new Employee(6000);

        System.out.println("Employee " + e1.getEmpNo() + " salary: " + e1.getSalary());
        System.out.println("Employee " + e2.getEmpNo() + " salary: " + e2.getSalary());
        System.out.println("Employee " + e3.getEmpNo() + " salary: " + e3.getSalary());

        Employee.displayTotals();
    }
}