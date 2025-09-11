import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String arr[]={"Sunday","Monday","Tuesday","Wednesday","Friday","Saturday"};

        System.out.println("Enter a number of day (Starting from 0)");
        int num=inp.nextInt();
        if(num>=0 && num<=6){
            for(int i=0;i<arr.length;i++){
                if(num==i){
                    System.out.println("Day is : "+arr[i]);
                }
            }
        }else
        System.out.println("Invalid choice");
    }
}