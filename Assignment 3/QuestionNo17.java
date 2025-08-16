import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=inp.next().charAt(0);
        if((ch>=32 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127))
        System.out.println("Character is a special character");
        else
        System.out.println("Character is not a special character");
    }
}