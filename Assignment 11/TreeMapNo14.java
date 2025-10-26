// 14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.


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
       int givenKey=102;
       SortedMap<Integer,String> head=colors.headMap(givenKey,true);
       System.out.println("Portion of the map with keys strictly less than or equal" + givenKey + ": " + head);

    }   
}