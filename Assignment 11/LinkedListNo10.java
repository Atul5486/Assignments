//  Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.addLast(1);

        System.out.println("First Element : "+list.getLast()); 
        System.out.println("Last Element  : "+list.getFirst());        

    }
}