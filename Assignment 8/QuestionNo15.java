import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Student std1=new Student(inp);
        Student std2=new Student(inp);
    }
}
class Student{
    private int rollno;
    private String name;
    private static int totalObj=0;
        Student(Scanner inp){
        System.out.println("Enter roll no");
        rollno=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter student name");
        name=inp.nextLine();
        totalObj++;
        System.out.println("Total number of object is : "+totalObj);
    }
}