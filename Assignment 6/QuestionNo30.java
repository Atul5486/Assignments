import java.util.Scanner;
class Main {
    static void even(int n){
        System.out.print("Even number series : ");
        for(int i=0;i<=n;i++){
           System.out.print(i*2+" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of term");
        int num=inp.nextInt();
        even(num);
    }
}