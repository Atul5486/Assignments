// 25. Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        Collections.addAll(list,"Mango","Banana","Apple","Cherry","Dragon fruit");
        if(list.isEmpty())
        System.out.println("List is empty");
        else
        System.out.println("List isn't empty");
    }
}