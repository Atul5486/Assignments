/* 42. Create a class Student with two members : rollno and percentage.
Create default and parameterized constructors. Create method show() to display information.
Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method.

Create another class SchoolStudent inherits Student class. Add a new member classname(eg 12 th ,10 th etc.) to it. Create default and parameterized constructors. Also override show() method.

Create a class(say XYZ) with main method that carries out the operation of the
project :
-- has array to store objects of any class(Student or CollegeStudent,SchoolStudent)
--create two CollegeStudent and three SchoolStudent record objects and store them inside the array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.--count how many students are having A grade, if for A grade percentage >75
*/
import java.util.Scanner;
class Student{
    int rollno;
    double per;
    String name;
    Student(){}
    Student(int rollno,double per,String name){
        this.rollno=rollno;
        this.per=per;
        this.name=name;
    }
    void show(){
        System.out.println("Roll no : "+rollno);
        System.out.println("Percentage: "+per);
    }
}
class CollegeStudent extends Student{
    private String sem;
    CollegeStudent(){}
    CollegeStudent(int rollno,double per,String name, String sem){
        super(rollno,per,name);
        this.sem=sem;
    }
    @Override
    void show(){
        System.out.println("\nCollege Student Detail");
        System.out.println("Name : "+name);
        System.out.println("Semester : "+sem);
        System.out.println("Roll no : "+rollno);
        System.out.println("Percetage : "+per);
    }

}
class SchoolStudent extends Student{
 private String classname;
    SchoolStudent(){}
    SchoolStudent(int rollno,double per,String name, String classname){
        super(rollno,per,name);
        this.classname=classname;
    }
    @Override
    void show(){
        System.out.println("\nSchool Student Detail");
        System.out.println("Name : "+name);
        System.out.println("Class : "+classname);
        System.out.println("Roll no : "+rollno);
        System.out.println("Percetage : "+per);

    }
}
class Main{
    public static void main(String args[]){
        String name,classname;
        int rollno;
        double per;
        Scanner inp=new Scanner(System.in);
        Student std[]=new Student[5];
        int count=0;
    System.out.println("Enter College Student Records");
        for(int i=0;i<2;i++){
            System.out.println("Enter Student "+(i+1)+" Details");
            System.out.print("Enter name of student : ");
            name=inp.nextLine();
            System.out.print("Enter semester of student : ");
            classname=inp.nextLine();
            System.out.print("Enter roll no of student : ");
            rollno=inp.nextInt();
            System.out.print("Enter Percentage : ");
            per=inp.nextDouble();
            inp.nextLine();
            std[count++]=new CollegeStudent(rollno,per,name,classname);
        }  

        for(int i=0;i<3;i++){
            inp.nextLine();
            System.out.println("Enter Student "+(i+1)+" Details");
            System.out.print("Enter name of student : ");
            name=inp.nextLine();
            System.out.print("Enter classname of student : ");
            classname=inp.nextLine();
            System.out.print("Enter roll no of student : ");
            rollno=inp.nextInt();
            System.out.print("Enter Percentage : ");
            per=inp.nextDouble();
            std[count++]=new SchoolStudent(rollno,per,name,classname);
        }   
        System.out.println("All student records");
        for(int i=0;i<std.length;i++){
            std[i].show();
        }
        System.out.println("\nFound student here\n");
        System.out.println("Enter roll no");
        int findrno=inp.nextInt();
        boolean find=false;
        for(Student s:std){
            if(s.rollno==findrno){
                s.show();
            if(s instanceof CollegeStudent){
                System.out.println("College Student");
            }else
            System.out.println("School student");
            find=true;
            break;
            }
            if(!find){
                System.out.println("Student not found");-
            }
        }
        int grade=0;
        for(Student s:std){
            if(s.per>75){
                grade++;
            }
    }
    System.out.println("Number of student above 75 : "+grade);
    }
}