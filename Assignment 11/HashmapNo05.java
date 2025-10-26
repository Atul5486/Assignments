// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        if(student.isEmpty())
        System.out.println("Student hashmap is empty : "+student);
        else
        System.out.println("Student hashmap isn't empty it contains: "+student);
    }
}