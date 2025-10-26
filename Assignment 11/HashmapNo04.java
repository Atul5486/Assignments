// 4. Write a Java program to remove all mappings from a map.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        System.out.println("Before Removing key-value : "+student);
        student.clear();
        System.out.println("After Removing key-value : "+student);
    }
}