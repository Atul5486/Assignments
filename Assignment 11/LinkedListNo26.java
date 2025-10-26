// 26. Write a Java program to replace an element in a linked list.
import java.util.LinkedList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        Collections.addAll(list,"Mango","Banana","Apple","Cherry","Dragon fruit");
       System.out.println("Before Change in list : "+list);
       list.set(2,"Guava");
       System.out.println("After Change in list : "+list);
    }
}