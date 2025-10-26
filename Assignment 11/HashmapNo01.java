// 1. Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        System.out.println(student);
    }
}