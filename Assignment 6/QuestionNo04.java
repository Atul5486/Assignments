class Main{
    public static void main(String args[]){
        int arr[]={10,11,12,13,15,16,17};
        int first=0;
        int last=arr.length-1;
        while(first <last){
           int temp=arr[first];
           arr[first]=arr[last];
           arr[last]=temp;
           first++;
           last--;
       }
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}