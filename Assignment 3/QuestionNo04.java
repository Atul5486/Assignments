import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a character");
       char ch=inp.next().charAt(0);
       if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
       System.out.println("Character is alphabet");
       else
       System.out.println("Character is not alphabet");
    }
}