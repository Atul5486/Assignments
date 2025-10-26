// 9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.


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

       System.out.println("Original TreeMap: " + colors);

        Integer firstKey = colors.firstKey();
        System.out.println("First (lowest) key: " + firstKey);

        Integer lastKey = colors.lastKey();
        System.out.println("Last (highest) key: " + lastKey);
    }   
}