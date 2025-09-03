import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=inp.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter element in array");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        
        System.out.println("Enter position");
        int pos=inp.nextInt();
        if(pos > arr.length || pos<1) return;
        System.out.println("Enter element");
        int elem=inp.nextInt();
        for(int i=size;i>=pos;i--){
            arr[i]=arr[i-1];
        }
       arr[pos - 1] = elem;
       System.out.println("Array after insertion:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
}