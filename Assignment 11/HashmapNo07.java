// 7. Write a Java program to test if a map contains a mapping for the specified key.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        if(student.containsKey("Adi"))
        System.out.println("Student hashmap contains this specified key");
        else
        System.out.println("Student hashmap not contains this specified key");
    }
}