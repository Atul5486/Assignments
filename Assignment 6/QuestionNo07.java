class Main {
    static void asecending(int arr[],int n){
       for(int i=0;i<n-1;i++){
           int min=i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[min])
               min=j;
           }
           int temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;
           
       }
          for(int elem:arr)
        System.out.print(elem+" ");
    }
    static void decending(int arr[],int n){
       for(int i=0;i<n-1;i++){
           int max=i;
           for(int j=i+1;j<n;j++){
               if(arr[max]<arr[j])
               max=j;
           }
           int temp=arr[max];
           arr[max]=arr[i];
           arr[i]=temp;
       }
          for(int elem:arr)
        System.out.print(elem+" ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,6};
        int n=arr.length;
        System.out.println("Array in acending order !!");
        asecending(arr,n);
        System.out.println();
        System.out.println("Array in decending oerder !!");
        decending(arr,n);
    }
}