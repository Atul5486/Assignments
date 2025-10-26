// 1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        System.out.println("Elements in treeset : "+colors);
    }   
}