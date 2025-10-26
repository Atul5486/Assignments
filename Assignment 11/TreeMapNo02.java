//2. Write a Java program to copy Tree Map's content to another Tree Map.

import java.util.TreeMap;
class Main{
    public static void main(String args[]){
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(1,"Red");
        colors.put(2,"Pink");
        colors.put(3,"LightPink");
        colors.put(4,"Dark Pink");
        colors.put(5,"Yellow");
       TreeMap<Integer,String> colorsCopy=new TreeMap<>(colors);
       System.out.println("Copy elements in another TreeMap : "+colorsCopy);
    }   
}