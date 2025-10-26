//3. Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
       HashMap<String,Integer> duplicateStudent=new HashMap<>(student);
       System.out.println(duplicateStudent);
    }
}