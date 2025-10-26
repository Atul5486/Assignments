//5. Write a Java program to get all keys from a Tree Map.

import java.util.TreeMap;
import java.util.Set;
class Main{
    public static void main(String args[]){
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(1,"Red");
        colors.put(2,"Pink");
        colors.put(3,"LightPink");
        colors.put(4,"Dark Pink");
        colors.put(5,"Yellow");
        Set<Integer> set=colors.keySet();
       System.out.println("All key from given tree map : "+set);
    }   
}