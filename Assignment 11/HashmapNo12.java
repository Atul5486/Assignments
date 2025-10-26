// 12. Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);

        Collection<Integer> value = student.values();
        System.out.println("Set view of the keys: " + value);
    }
}