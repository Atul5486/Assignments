import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=inp.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=inp.nextInt();
        }
        int first=arr[0];
        int last=arr[arr.length-1];
        System.out.println("Sum of first and last element of array is "+(first+last));
    }
}