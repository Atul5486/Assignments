import java.util.Scanner;
class Main {
    static void alpha(char c){
        for(char ch='a';ch<=c;ch++){
           System.out.print(ch+" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of term (a-z)");
        char ch=inp.next().toLowerCase().charAt(0);
        alpha(ch);
    }
}