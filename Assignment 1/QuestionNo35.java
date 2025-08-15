import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        int m=0;
        for(int i=1;i<=num;i++){
            m=num+i;
        }
        System.out.println("2 x "+num+" = "+m);
        
    }
}