class Max{
    private int v;
    void getV(int v){
        this.v=v;
    }
    int display(){
        return v;
    }
    Max check(Max m){
        if(m.v>this.v) return m;
        else return this;
    }
}
class Main{
    public static void main(String args[]){
        Max m1=new Max();
        m1.getV(100);
        Max m2=new Max();
        m2.getV(20);
        Max max=m2.check(m1);
        System.out.println("Maximum value of v is : "+max.display());
    }
}