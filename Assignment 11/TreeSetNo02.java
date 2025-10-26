// 2. Write a Java program to iterate through all elements in a tree set.
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        Iterator itr=colors.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
    }   
}