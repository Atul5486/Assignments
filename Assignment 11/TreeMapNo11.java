// 11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

import java.util.TreeMap;
import java.util.Collections;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");
       Integer givenKey=102;
       System.out.println("Lowest Keys are :");
       for(Integer i:colors.keySet()){
        if(i<=givenKey)
        System.out.println(i);
       }


    }   
}