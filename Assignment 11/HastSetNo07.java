// 7. Write a Java program to convert a hash set to an array.

import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2,10);
        int arr[]=new int[set.size()];
        int i=0;
        for(Integer elem:set)
        arr[i++]=elem;
        System.out.println("Set Elements");
        System.out.println(set);
        System.out.println("Array Elements");
         for(int elem:arr)
        System.out.println(elem);
        
    }
}