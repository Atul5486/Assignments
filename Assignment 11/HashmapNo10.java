// 10. Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;
class Main{
    public static void main(String args[]){
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Adi",80);
        student.put("Om",72);
        student.put("Jay",42);
        student.put("Prem",72);
        System.out.println("Value of Om is : "+student.get("Om"));
    }
}