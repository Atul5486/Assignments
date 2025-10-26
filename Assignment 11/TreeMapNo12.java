// 12. Write a Java program to get the greatest key less than or equal to the given key.

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
       
       Integer f1=colors.floorKey(110);
       System.out.println("Greatest key less than or equal : "+f1);
       Integer f2=colors.floorKey(103);
       System.out.println("Greatest key less than or equal : "+f2);
       Integer f3=colors.floorKey(101);
       System.out.println("Greatest key less than or equal : "+f3);

    }   
}