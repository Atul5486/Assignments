// 8. Write a Java program to test if a map contains a mapping for the specified value.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        if(student.containsValue(72))
        System.out.println("Student hashmap contains this specified value");
        else
        System.out.println("Student hashmap not contains this specified value");
    }
}