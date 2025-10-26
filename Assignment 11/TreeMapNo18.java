// 18. Write a Java program to get a NavigableSet view of keys in a map.

import java.util.TreeMap;
import java.util.NavigableSet;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");
       NavigableSet<Integer> nav=colors.navigableKeySet();
       System.out.println("Navigable Key Set are : "+nav);
    }   
}