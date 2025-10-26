// 25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.

import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");
       int search=106;
       Map.Entry<Integer, String> entry1 = colors.ceilingEntry(search);
        System.out.println("For key " + search + ", ceiling entry: " + (entry1 != null ? entry1.getKey() + "=" + entry1.getValue() : "null"));
       
    }   
}