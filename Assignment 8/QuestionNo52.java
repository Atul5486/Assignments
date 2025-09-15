// 52. Write a program to create Login and Registration example using string showing validation on registration form fields(validations on email, mobile number, username etc)
import java.util.Scanner;
import java.util.regex.*;
class Main{
    public static Scanner inp=new Scanner(System.in);
    public static String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public static String nameRegex ="^[A-Za-z' -]{1,40}$";
    public static String mobileRegex = "^(?:\\+91|0)?[6-9]\\d{9}$"; 
    public static String passwordRegex = "^(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";
    static String name,email,password,mob;
    static void registration(){
        System.out.println("\n========== Welcome to Registration ==========");
        do{
        System.out.println("Enter your name");
        name=inp.nextLine();
        }while(!name.matches(nameRegex));
        do{
        System.out.println("Enter your email");
        email=inp.nextLine();
        }while(!email.matches(emailRegex));
        do{
        System.out.println("Enter your mobile number");
        mob=inp.nextLine();
        }while(!mob.matches(mobileRegex));
        do{
        System.out.println("Enter your password(Min length 8)");
        password=inp.nextLine();
        }while(!password.matches(passwordRegex));
        System.out.println(email+""+password);
        login();
    }
    static void login(){
        System.out.println("\n========== Welcome to Login ==========");
        System.out.println("Enter your email");
        String e=inp.nextLine();
        System.out.println("Enter your password");
        String p=inp.nextLine();
        if(email==null || password==null){
            System.out.println("No account found");
           registration();
        }
        if(e.equals(email)&&p.equals(password)){
            display();
        }else login();
    }
    static void display(){
        System.out.println("Successfully Login ");
        System.out.println("Welcome ,"+name);
    }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a choice\n1.Login\n2.Registration\n3.Exit");
        int ch=inp.nextInt();
        do{
        switch(ch){
            case 1:registration();break;
            case 2:login();break;
            case 3:System.out.println("Existing");break;
            default:System.out.println("Invalid input");break;
        }
        }while(ch!=3);
    }
}