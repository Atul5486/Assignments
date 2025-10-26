// 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.


import java.util.TreeMap;
import java.util.SortedMap;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");
       Integer from=103;
       Integer to=105;
       SortedMap<Integer,String>  map=colors.subMap(from,to);
       System.out.println("Sub-map (keys from " + from + " inclusive to " + to + " exclusive): " + map);
       
    }   
}