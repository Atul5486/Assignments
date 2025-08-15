import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=inp.next().charAt(0);
        String str=(ch>=97 && ch <=122) ? "Character in lowercase":"Character is not in lowercase";
        System.out.println(str);
       
    }
}