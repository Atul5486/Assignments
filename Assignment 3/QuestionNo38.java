import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter marks of 1 subject : ");
        int mark1=inp.nextInt();
        System.out.print("Enter marks of 2 subject : ");
        int mark2=inp.nextInt();
        System.out.print("Enter marks of 3 subject : ");
        int mark3=inp.nextInt();
        float avg=(float)(mark1+mark2+mark3)/3.0f;
        System.out.println(avg);
        if(mark1>=75 && mark2>=75 && mark3>=75 && avg>=80)
        System.out.println("You are pass in exam");
        else
        System.out.println("You are fail in exam");
    }
}