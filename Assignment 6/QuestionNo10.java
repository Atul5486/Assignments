class Main {
   
    public static void main(String[] args) {
        int arr[]={11,2,40,3,6};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min=arr[i];
        }
       System.out.println("Minimum element in array is : "+min);
    }
}