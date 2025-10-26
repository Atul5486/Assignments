// 16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.

import java.util.TreeMap;

class Main {
    public static void main(String args[]){
       TreeMap<Integer,String> colors=new TreeMap<>();
       colors.put(101,"Pink");
       colors.put(103,"Red");
       colors.put(102,"Green");
       colors.put(105,"Purple");
       colors.put(104,"Black");
        Integer findKey = 101;
        Integer lowerKey = colors.lowerKey(findKey);
        System.out.println("Least key strictly greater than " + findKey + " : " + lowerKey);
    }   
}