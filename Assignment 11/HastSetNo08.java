// 8. Write a Java program to convert a hash set to a tree set.

import java.util.*;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2,10);
        TreeSet<Integer> treeSet=new TreeSet<>(set);
        System.out.println("Tree set Elements : "+treeSet);
        
    }
}