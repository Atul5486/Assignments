import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors1=new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Yellow");

        ArrayList<String> colors2=new ArrayList<>();

        colors2.addAll(colors1);

        System.out.println("Original ArrayList: "+colors1);
        System.out.println("Copied ArrayList: "+colors2);
    }
}