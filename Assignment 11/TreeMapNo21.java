// 21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).

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
       Integer first=103;
       Integer last=110;
       SortedMap<Integer,String>  map=colors.subMap(first,last);
       System.out.println(map);
       
    }   
}