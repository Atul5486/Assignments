import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        String searchColor="Blue";

        if(colors.contains(searchColor)){
            System.out.println(searchColor+" is found in the list.");
        }else{
            System.out.println(searchColor+" is not found in the list.");
        }
    }
}