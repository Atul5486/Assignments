// 22. Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        list.addLast("1");
        list.add("10");
        list.add("100");
        if(list.contains("100")){
            System.out.println("Element exists");
        }else
        System.out.println("Element not exists");
    }
}