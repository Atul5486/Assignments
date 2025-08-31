import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch=inp.next().toLowerCase().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println("Alphabet is vowel"); break;
            default:
            System.out.println("Alphabet is Not vowel");
        }
    }
}