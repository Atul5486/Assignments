// 11. Write a Java program to get a set view of the keys contained in this map.

import java.util.HashMap;
import java.util.Set;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);

        Set<String> keySet = student.keySet();
        System.out.println("Set view of the keys: " + keySet);
    }
}