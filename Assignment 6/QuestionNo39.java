import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=inp.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element in array");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        System.out.println("Enter position");
        int pos=inp.nextInt();
        if(pos > arr.length || pos<1) return;
        for (int i = pos-1; i<size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
       System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}