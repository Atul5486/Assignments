class Main {
   
    public static void main(String[] args) {
        int arr[]={1,2,40,3,6};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }
       System.out.println("Maximum element in array is :  "+max);
    }
}