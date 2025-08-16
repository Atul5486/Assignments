import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int last=num%10;
        int first=num/10;
        if(num<=9999){
        if(last>=5){
            first+=1;
            last=0;
        }else
        last=0;
        num=first*10+last;
        System.out.println("Round off : "+num);
        } else
        System.out.println("Try again");
    }
}