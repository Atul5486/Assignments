import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter anything in uppercase: ");
        String str=inp.next();
        str=str.toLowerCase();
        System.out.println("Lowercase of given String is : "+str); 
    }
}