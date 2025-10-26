// 3. Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        TreeSet<String> addColors=new TreeSet<>(colors);
        System.out.println("Colors in another treeset : "+addColors);
    }   
}