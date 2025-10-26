// 6. Write a Java program to clone a tree set list to another tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        TreeSet<String> anotherColors=(TreeSet<String>)colors.clone();
        System.out.println("Elements in Colors Set : "+colors);
        System.out.println("Element in anotherColors Set : "+anotherColors);

    }   
}