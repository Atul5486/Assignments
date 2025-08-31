import java.util.Scanner;

class Main{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt(); sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        
        Student student = new Student(roll, name, age, course, marks);

        student.displayReport();
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;
    int[] marks;
    int total;
    double percentage;
    String grade;

    Student(int rollNo, String name, int age, String course, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        calculateResult();
    }

    void calculateResult() {
        total = 0;
        for (int m : marks) total += m;
        percentage = total / (double) marks.length;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 75) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "F";
    }

    void displayReport() {
        System.out.println("\n========= Student Report =========");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        for(int i=0;i<marks.length;i++)System.out.println("Subject "+(i+1)+" : "+marks[i]);
        System.out.println("Total   : " + total);
        System.out.println("Percent : " + percentage + "%");
        System.out.println("Grade   : " + grade);
        System.out.println("=================================");
    }
}
