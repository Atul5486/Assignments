import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a character");
       char ch=inp.next().charAt(0);
       if(ch ==36)
       System.out.println("Character is $");
       else if(ch==64)
       System.out.println("Character is @");
       else 
       System.out.println("Character is not Match");
    }
}