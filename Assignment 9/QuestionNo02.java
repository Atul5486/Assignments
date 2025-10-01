class University {
    String universityName, location;
    Department[] departments; // array of departments
    int count = 0;            // actual number of departments added

    University(String un, String location) {
        this.universityName = un;
        this.location = location;
        this.departments = new Department[10]; // max 10 departments
    }

    void addDepartment(String name, String head, String[] courses) {
        if (count < departments.length) {
            departments[count++] = new Department(name, head, courses);
        } else {
            System.out.println("Cannot add more departments!");
        }
    }

    void displayDepartments() {
      System.out.println("\nUniversity Name : "+this.universityName);
      System.out.println("University Location : "+this.location+"\n");
        for (int i = 0; i < count; i++) {
            departments[i].displayInfo();
        }
    }
    class Department {
        String name, head;
        String[] courses;

        Department(String name, String head, String[] courses) {
            this.name = name;
            this.head = head;
            this.courses = courses;
        }

        void displayInfo() {
            System.out.println("Department Name: " + name);
            System.out.println("Head Of Department: " + head);
            System.out.print("Courses: ");
            for (String str : courses) {
                System.out.print(str + " ");
            }
            System.out.println("\n----------------------");
        }
    }
    static class UniversityStats {
        static void getDepartmentCount(University uni) {
            System.out.println("Total Departments: " + uni.count);
        }

        static void listDepartmentNames(University uni) {
            System.out.println("Departments in " + uni.universityName + ":");
            for (int i = 0; i < uni.count; i++) {
                System.out.println("- " + uni.departments[i].name);
            }
        }
    }
}
class Main {
    public static void main(String args[]) {
        University uni = new University("RGPV", "Bhopal");

        String[] csCourses = {"Data Structures", "AI"};
        String[] mechCourses = {"Thermodynamics", "Mechanics"};
        String[] ecCourses = {"Circuits", "Signals"};

        uni.addDepartment("Computer Science", "Mr. Mehta", csCourses);
        uni.addDepartment("Mechanical", "Mr. Sharma", mechCourses);
        uni.addDepartment("Electronics", "Ms. Gupta", ecCourses);

        // Display departments
        uni.displayDepartments();

        // Use UniversityStats
        University.UniversityStats.getDepartmentCount(uni);
        University.UniversityStats.listDepartmentNames(uni);
    }
}

