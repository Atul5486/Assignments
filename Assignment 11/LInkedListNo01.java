// 1. Write a Java program to append the specified element to the end of a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        
        // Add Element at last By using different Methods

        list.add(list.size(),4);
        list.offerLast(101);
        list.addLast(50);
        System.out.println(list); 
    }
}