import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter anything in lowercase: ");
        String str=inp.next();
        str=str.toUpperCase();
        System.out.println("Uppercase of given String is : "+str); 
    }
}