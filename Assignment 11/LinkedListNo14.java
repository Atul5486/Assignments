//  Write a Java program to remove all elements from a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println("Before Removing : "+list);
        list.removeAll(list);
        System.out.println("After Removing : "+list);
    }
}