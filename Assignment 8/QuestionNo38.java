// 38.Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
import java.util.Scanner;
class Tile{
    private int len;
    Tile(int len){
        this.len=len;
    }
    int getLen(){
        return len;
    }
}
class Floor{
    private int len,wid;
    double tileNo;
    Floor(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    double totalTiles(Tile t){
        int tilelength=t.getLen();
        return tileNo=(double)(len*wid)/tilelength;
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter length of tile");
        int tileLen=inp.nextInt();
        System.out.println("Enter length of Floor");
        int floorLen=inp.nextInt();
        System.out.println("Enter width of floor");
        int floorWid=inp.nextInt();
        Tile t=new Tile(tileLen);
        Floor f=new Floor(floorLen,floorWid);
        System.out.println("No of tiles required : "+f.totalTiles(t));
    }
}
