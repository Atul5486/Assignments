// Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(list.size(),4);
        list.offerLast(101);
        list.addLast(50);
        Iterator itr=list.iterator();
        System.out.println("List elements are : ");
        while(itr.hasNext())
        System.out.println(itr.next()); 
    }
}