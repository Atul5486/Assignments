// 1. Write a Java program to associate the specified value with the specified key in a Tree Map.
import java.util.TreeMap;
class Main{
    public static void main(String args[]){
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(1,"Red");
        colors.put(2,"Pink");
        colors.put(3,"LightPink");
        colors.put(4,"Dark Pink");
        colors.put(5,"Yellow");
        System.out.println("Elements in Tree Map : "+colors);
    }   
}