import java.util.Scanner;
class Main {
    static void nine(int n){
        int sum=0,temp=0;
        for(int i=1;i<=n;i++){
            temp=temp*10+9;
           System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of term");
        int num=inp.nextInt();
        nine(num);
    }
}