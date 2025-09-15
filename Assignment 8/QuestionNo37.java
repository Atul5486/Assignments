// 37. Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.Scanner;
class Student{
    private int rollno,age,score;
    private String name;
    Student(int rollno,String name,int age,int score){
        this.name=name;
        this.rollno=rollno;
        this.score=score;
        this.age=age;
    }
    void display(){
        System.out.println("\nRoll No : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Score : "+score);
    }
    int getScore() {return score;}

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Student st[]=new Student[10];
        int rollno,age,score;
        String name;
        for(int i=0;i<st.length;i++){
            System.out.println("\nEnter rollno of "+(i+1)+" Student");
            rollno =inp.nextInt();
            inp.nextLine();
            System.out.println("Enter name");
            name=inp.nextLine();
            System.out.println("Enter age");
            age=inp.nextInt();
            System.out.println("Enter score");
            score=inp.nextInt();
            st[i]=new Student(rollno,name,age,score);
        }
    System.out.println("\n--- Students with score [0-50] ---");
     for(Student s:st){
        if(s.getScore()>=0 && s.getScore()<50){
        s.display();
        }
            
     }
    System.out.println("\n--- Students with score  [50-65] ---");
     for(Student s:st){
        if(s.getScore()>=50 && s.getScore()<65){
        s.display();
        }
     }
    System.out.println("\n--- Students with score  [65-80] ---");
     for(Student s:st){
        if(s.getScore()>=65 && s.getScore()<80){
        s.display();
        }
     }
    System.out.println("\n--- Students with score [80-100] ---");
     for(Student s:st){
        if(s.getScore()>=80 && s.getScore()<=100){   
        s.display();
        }
     }

    }
}