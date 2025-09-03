//WAP to reverse individual elements of an array
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int arr[]={5,63,52,14,96,58,521};
        for(int i=0;i<arr.length;i++){
            int res=0;
            while(arr[i]!=0){
                 int rem=arr[i]%10;
                 res=res*10+rem;
                 arr[i]/=10;
            }
            arr[i]=res;
        }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}