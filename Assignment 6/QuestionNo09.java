// 9) WAP to find out the largest(maximum) element from an array
class Main{
    public static void main(String args[]){
        int arr[]={10,200,30,40,60,2,58};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in array : " +max);
    }
}