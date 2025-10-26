// 7. Write a Java program to sort keys in a Tree Map by using a comparator.

import java.util.TreeMap;
import java.util.Comparator;

class Main implements Comparator<Integer>{
    @Override
    public int compare(Integer i1,Integer i2){
        return i2.compareTo(i1);
    }
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>(new Main());
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");

        System.out.println("TreeMap sorted by keys in descending numerical order:");
        for (Integer key : colors.keySet()) {
            System.out.println(key + " -> " + colors.get(key));
        }
    }   
}