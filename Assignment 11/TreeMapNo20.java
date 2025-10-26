// 20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.


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
    //    colors.clear();
       Map.Entry<Integer,String> map=colors.pollLastEntry();
      if (map != null) {
            System.out.println("Removed entry with greatest key: " + map);
            System.out.println("TreeMap after removal: " + colors);
        } else {
            System.out.println("The TreeMap was empty.");
        }
    }   
}