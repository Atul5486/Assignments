// 9. Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        Set<Map.Entry<String, Integer>> entrySetView = student.entrySet();
         System.out.println("Original Map: " + student);

        System.out.println("Set View of Mappings: " + entrySetView);
    }
}