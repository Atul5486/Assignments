// 9. Write a Java program to find numbers less than 7 in a tree set.

import java.util.*;
class Main{
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<>();
        Collections.addAll(set,10,15,1,2,3,5,6,3,2,10);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            int elem=(int)itr.next();
            if(elem<7)
            System.out.println(elem);
        }
        
    }
}