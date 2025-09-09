import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Box box1=new Box(100,20,30);
        Box box2=new Box(20,10,30);
        box2.compare(box1);
        box1.display();
    }
}
class Box{
    public static Scanner inp=new Scanner(System.in);
    private String boxlabel;
    private int length;
    private int width;
    private int height;
    Box(int length,int width,int height){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    int volume(){ 
        return length*height*width;
    }
    void compare(Box box1){
    int currentvol=this.volume();
    int vol=box1.volume();
    if(currentvol==vol) this.boxlabel="Both are equal";
    else if(currentvol>vol) this.boxlabel="Current object volume is greater";
    else box1.boxlabel="Passed class object volume is greater";
    display();
    }
    void display(){
        System.out.println(boxlabel);
    }
}