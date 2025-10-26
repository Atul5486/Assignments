// 8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

import java.util.TreeMap;
import java.util.Map;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");

       System.out.println("Original TreeMap : "+colors);
       Map.Entry<Integer,String> least=colors.firstEntry();
        if (least != null) 
            System.out.println("Entry with the least key: " + least);
         else 
            System.out.println("The map is empty, no least key found.");
        Map.Entry<Integer,String> greatest=colors.lastEntry();
        if (greatest != null) 
            System.out.println("Entry with the Greatest key: " + greatest);
         else 
            System.out.println("The map is empty, no Greatest key found.");
    }   
}