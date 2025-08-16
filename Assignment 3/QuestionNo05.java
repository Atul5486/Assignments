import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter a digit");
       char ch=inp.next().charAt(0);
       if(ch>='0' && ch<='9')
       System.out.println("It is a digit");
       else
       System.out.println("It is not a digit");
    }
}