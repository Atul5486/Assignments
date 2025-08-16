import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a digit");
       char ch=inp.next().charAt(0);
       String str=String.valueOf(ch);
       String s=str.replace(ch,'*');
       if(ch >='0' && ch<='9')
       System.out.println("Yes entered character is digit \n"+s);
       else 
       System.out.println("Character not in lowercase");
    }
}