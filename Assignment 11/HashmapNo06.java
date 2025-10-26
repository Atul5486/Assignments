// 6. Write a Java program to get a shallow copy of a HashMap instance.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        HashMap<String,Integer> studentClone=(HashMap<String,Integer>) student.clone();
        System.out.println(studentClone);
    }
}