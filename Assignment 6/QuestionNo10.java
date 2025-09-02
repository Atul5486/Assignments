//10) WAP to find out the smallest(minimum) element from an array
class Main{
    public static void main(String args[]){
        int arr[]={10,20,30,40,60,2,58,-25};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in array :"+min);
    }
}