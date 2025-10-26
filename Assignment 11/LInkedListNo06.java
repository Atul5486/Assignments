//  6. Write a Java program to insert elements into the linked list at the first and last positions 
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.offerLast(101);
        list.addLast(50);
        list.offerFirst(5);
        list.addFirst(1);

        System.out.println(list);

                 
    }
}