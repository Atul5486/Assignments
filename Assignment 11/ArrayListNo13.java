import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        if(list1.equals(list2)){
            System.out.println("ArrayLists are equal.");
        }else{
            System.out.println("ArrayLists are not equal.");
        }
    }
}