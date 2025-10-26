// 26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.

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
       int search=103;
       Integer  key= colors.ceilingKey(search);
        System.out.println("Least key greater than or equal to " + search+" : "+key);
       
    }   
}