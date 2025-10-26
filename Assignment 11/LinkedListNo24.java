//  24. Write a Java program to compare two linked lists.
import java.util.LinkedList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        Collections.addAll(list,"Mango","Banana","Apple","Cherry","Dragon fruit");
        LinkedList<String> list1=new LinkedList<>();
        Collections.addAll(list1,"Mango","Banana","Apple","Cherry","Dragon fruit");
        // Collections.addAll(list1,"Guava","Stauberry","Apple","Cherry","Dragon fruit");
        if(list.equals(list1))
        System.out.println("Both are equal");
        else
        System.out.println("Both are not equal");
    }
}