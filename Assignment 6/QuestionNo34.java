import java.util.Scanner;
class Main {
    static void alpha(){
        for(char ch='z';ch>='a';ch--){
           System.out.print(ch+" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.println("Alphabet in reverse order");
        alpha();
    }
}