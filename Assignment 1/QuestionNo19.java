import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=inp.next().charAt(0);
        String str=(ch>=97 && ch<=122) ? String.valueOf(Character.toUpperCase(ch)) :"Character is not in Lowercase";
        System.out.println(str);
       
    }
}