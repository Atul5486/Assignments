// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        System.out.println("Before Reverse : "+colors);
        colors=new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        System.out.println("After Reverse : "+colors);

    }   
}