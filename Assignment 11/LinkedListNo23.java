//  Write a Java program to convert a linked list to an array list.
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        Collections.addAll(list,"Mango","Banana","Apple","Cherry","Dragon fruit");
        ArrayList<String> array=new ArrayList<>(list);
        System.out.println(array);
    }
}