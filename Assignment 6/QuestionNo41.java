class Main {
    static void palindrome(int arr[],int n){
        int check=0;
        for(int i=0;i<n/2 & n!=0;i++){
            if(arr[i]!=arr[n-i-1]){
                check++;
                break;
            }
        }
        if(check==1) System.out.println("Array is not palindrome");
        else System.out.println("Array is palindrome");
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,2,1};
        int n=arr.length;
        palindrome(arr,n);
    }
}