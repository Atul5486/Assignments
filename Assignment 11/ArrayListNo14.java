// Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dargon Fruit");

        System.out.println("Before swap: " + list);

        Collections.swap(list, 1, 3);

        System.out.println("After swap: " + list);
    }
}