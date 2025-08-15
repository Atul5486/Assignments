import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=inp.next().charAt(0);
        String str=(ch>=65 && ch<=90) ? String.valueOf(Character.toLowerCase(ch)) :"Character is not in uppercase";
        System.out.println(str);
       
    }
}