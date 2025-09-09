class Distance{
    private int feet;
    private int inch;
    Distance(int feet,int inch){
        this.feet=feet;
        this.inch=inch;
    }
    void fun(Distance dis){
        int sumF=this.feet+dis.feet;
        int sumI=this.inch+dis.inch;
        System.out.println("Total feet is : "+sumF);
        System.out.println("Total inches is : "+sumI);
    }
}
class Main{
    public static void main(String args[]){
    Distance d1=new Distance(10,20);
    Distance d2=new Distance(15,25);
    d2.fun(d1);
    }
}