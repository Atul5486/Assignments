import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Nationality (I or i)");
        char ch=inp.next().charAt(0);
        int age;
        if(ch=='i' || ch=='I'){
            System.out.println("Enter your age");
            age=inp.nextInt();
            if(age>=18)
            System.out.println("You are eligible for vote");
            else
            System.out.println("You are not eligible for vote");
        }
        else
        System.out.println("Citizen is not an indian");
    }
}