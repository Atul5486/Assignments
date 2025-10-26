// 7. Write a Java program to get the number of elements in a tree set.
import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        System.out.println("Number of Elements in treeSet  : "+colors.size());
        
    }   
}