class Main {
            static void alphaSort(String arr[]){
                for(int i=0;i<arr.length;i++){
                    for(char j=0;j<arr.length-1-i;j++){
                        if(arr[j].compareTo(arr[j+1])>0){
                            String temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
                System.out.println("Sorted string ");
                for(String str:arr)
                System.out.println(str);
            }
    public static void main(String[] args) {
        String arr[]={"James","Adam","Babber","Aandrew","Peter"};
        alphaSort(arr);
    }
}