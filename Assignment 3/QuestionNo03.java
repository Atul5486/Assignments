import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a character");
       char ch=inp.next().charAt(0);
       if(ch>='a'&& ch<='z')
       System.out.println("Character in lowercase");
       else
       System.out.println("Character not in lowercase");
    }
}