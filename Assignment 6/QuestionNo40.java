import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int arr1[]={1,2,3,4};
        int arr2[]={10,5,6,8,7};
        int n=arr1.length+arr2.length;
        int merArr[]=new int[n];
        for(int i=0;i<merArr.length;i++){
            int count=0;
            for(int elem:arr1){
                merArr[count]=elem;
                count++;
            }
            for(int elem:arr2){
                merArr[count]=elem;
                count++;
            }
        }
        for(int elem:merArr){
            System.out.print(elem+" ");
        }
    }
}
