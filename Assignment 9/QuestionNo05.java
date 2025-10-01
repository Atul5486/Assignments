class CoursePlatform{
    String name;
    int id,age;
    static Course cs[]=new Course[5];
    static int count=0;
    CoursePlatform(String name,int id,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    void addCourse(String title,String instructor,String course[]){
        cs[count++]=new Course(title,instructor,course);
    }
    void display(){
        for(int i=0;i<count;i++){
            cs[i].courseDetails();
        }
    }
    void student(){
        System.out.println("Student name : "+name);
        System.out.println("Student id : "+id);
        System.out.println("Student age : "+age);
    }
    class Course{
        String title,instructor;
        String course[]=new String[5];
        Course(String title,String instructor,String course[]){
            this.course=course;
            this.title=title;
            this.instructor=instructor;
        }
        void courseDetails(){
            System.out.println("Course Name : "+title);
            System.out.println("Course Instructor : "+instructor);
            System.out.println("Course Includes : ");
            for(String cr:course){
                System.out.println(cr);
            }

        }
           String getInstructor(){
                return  instructor;
            }
    }
    static class PlatformStats{
       static void pDetails(){
            System.out.println("Total Number of courses : "+count);
            System.out.println("List of Instructor");
            for(int i=0;i<count;i++){
                System.out.println(cs[i].getInstructor());
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
     CoursePlatform cp=new CoursePlatform("Peter",101,20);   
     cp.addCourse("Data Science","Saurabh",new String[]{"Python","Django","Flask"});
     cp.addCourse("Data Science","Saurabh",new String[]{"Python","Django","Flask"});
     cp.student();
     cp.display();
     CoursePlatform.PlatformStats.pDetails();
    }

}