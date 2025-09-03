import java.util.Scanner;
class Main {
    static int elevan(int n){
        int sum=0,temp=0;
        for(int i=1;i<=n;i++){
            temp=temp*10+1;
           sum+=temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of term");
        int num=inp.nextInt();
        System.out.println(elevan(num));
    }
}