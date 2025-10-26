//  Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.addFirst(1);

        System.out.println(list);

                 
    }
}