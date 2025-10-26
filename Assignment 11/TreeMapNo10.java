// 10. Write a Java program to get a reverse order view of the keys contained in a given map.

import java.util.TreeMap;
import java.util.Collections;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>(Collections.reverseOrder());
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");

       System.out.println("Reverse Order of TreeMap : "+colors);

    }   
}