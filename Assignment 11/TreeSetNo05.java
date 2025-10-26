// 5. Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        System.out.println("First Element in Colors Set : "+colors.first());
        System.out.println("Last Element in Colors Set : "+colors.last());

    }   
}