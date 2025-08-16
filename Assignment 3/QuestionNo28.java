import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number in five digit : ");
        int num=inp.nextInt();
        int last=num%10;
        int first=num/10000;
        int middle=(num/10)%1000;
        int newNum=(last*10000)+(middle*10)+first;
       System.out.println("New Number after swapping : "+newNum+" "+digits);
    }
}