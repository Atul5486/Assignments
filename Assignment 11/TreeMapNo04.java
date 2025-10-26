//4. Write a Java program to search for a value in a Tree Map.

import java.util.TreeMap;
class Main{
    public static void main(String args[]){
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(1,"Red");
        colors.put(2,"Pink");
        colors.put(3,"LightPink");
        colors.put(4,"Dark Pink");
        colors.put(5,"Yellow");
        if(colors.containsValue("Pink"))
       System.out.println("Given tree Map contains specific value");
       else
       System.out.println("Given tree Map not contains specific value");
    }   
}