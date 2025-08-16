import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a 5 digit number : ");
        int num=inp.nextInt();
        if(num>=10000 && num<=99999){
        int sLast =(num%100)/10;
        int first=num/10000;
        int second=(num/1000)%10;
        int middle=(num/100)%10;
        int last=num%10;
        num=(first*10000)+(sLast*1000)+middle*100+second*10+last;
        System.out.println("After changing : "+num);
        }
        else
        System.out.println("Try again");
    }
}