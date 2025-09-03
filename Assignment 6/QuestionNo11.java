class Main{
    static void insertionSort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    for(int elem:arr){
        System.out.print(elem+" ");
    }
    
}

    public static void main(String args[]){
        int arr[]={10,20,63,25,36,85,20};
        insertionSort(arr);
    }
}