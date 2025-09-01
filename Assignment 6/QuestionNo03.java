import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=inp.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=inp.nextInt();
            sum+=arr[i];
        }
        double avg=(double)(sum/size);
        System.out.println("Average of array is : "+avg);
        
    }
}