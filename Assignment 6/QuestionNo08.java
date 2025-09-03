class Main {
    static void bubbleSortAsecending(int arr[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;  
            }
            }
        }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
    
    
    
    
    static void bubbleSortDecending(int arr[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    public static void main(String[] args) {
        int arr[]={11,2,40,3,6};
        int n=arr.length;
        System.out.println("Array in Aseceding order");
        bubbleSortAsecending(arr,n);
        System.out.println();
        System.out.println("Array in decending order");
        bubbleSortDecending(arr,n);
    }
}