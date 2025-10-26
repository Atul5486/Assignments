// 6. Write a Java program to clone a hash set to another hash set.

import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2,10);
        HashSet <Integer> set1=(HashSet<Integer>) set.clone();
        System.out.println("Set Elements");
        System.out.println(set);
        System.out.println("Set1 Elements");
        System.out.println(set1);
        
    }
}