import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(10); 
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        for(int i=0;i<colors.size();i++)
        System.out.println("Element "+(i+1) +" : " + colors.get(i));
    }
}