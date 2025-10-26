// 23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.

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
       Integer givenKey=103;
       SortedMap<Integer,String>  map=colors.tailMap(givenKey);
       System.out.println(map);
       
    }   
}