class Company {
    Employee[] emp = new Employee[100];
    int count = 0;

    void addEmp(String name, String designation, int id) {
        if (count < emp.length) {
            if (CompanyPolicy.validateDesignation(designation)) {
                emp[count++] = new Employee(name, designation, id);
                System.out.println("Employee added successfully!");
            } else {
                System.out.println("Invalid designation. Employee not added.");
            }
        } else {
            System.out.println("Unable to create more employees.");
        }
    }

    void removeEmp(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (emp[i].id == id) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    emp[j] = emp[j + 1];
                }
                emp[count - 1] = null;
                count--;
                System.out.println("Employee removed successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }

    void searchEmp(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (emp[i].id == id) {
                emp[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }

    void displayAll() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("---- Employee List ----");
        for (int i = 0; i < count; i++) {
            emp[i].display();
            System.out.println("----------------------");
        }
    }

    // Non-static inner class
    class Employee {
        String name, designation;
        int id;

        Employee(String name, String designation, int id) {
            this.name = name;
            this.id = id;
            this.designation = designation;
        }

        void display() {
            System.out.println("Employee Details");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    // Static nested class
    static class CompanyPolicy {
        static String[] validDesignations = {"Manager", "Developer", "Tester", "HR"};
        static int minHour = 8;

        static boolean validateDesignation(String designation) {
            for (String d : validDesignations) {
                if (d.equalsIgnoreCase(designation)) {
                    return true;
                }
            }
            return false;
        }

        static void enforceMinHours(int hoursWorked) {
            if (hoursWorked < minHour) {
                System.out.println("Warning: Employee did not complete minimum hours (" + minHour + ")");
            } else {
                System.out.println("Employee has met the minimum working hours requirement.");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Company c = new Company();

        c.addEmp("Peter", "Manager", 101);
        c.addEmp("Andrew", "Developer", 102);
        c.addEmp("Jack", "Clerk", 103);

        c.displayAll();

        c.searchEmp(102);
        c.searchEmp(200);

        c.removeEmp(101);
        c.displayAll();

        Company.CompanyPolicy.enforceMinHours(6);
        Company.CompanyPolicy.enforceMinHours(9);
    }
}