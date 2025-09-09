class Distance{
    private int feet;
    private int inch;
    Distance(int feet,int inch){
        this.feet=feet;
        this.inch=inch;
    }
    Distance fun(Distance dis){
        int sumF=this.feet+dis.feet;
        int sumI=this.inch+dis.inch;
        if(sumI>12){
            sumF+=sumI/12;
            sumI=sumI%12;
        }
        return new Distance(sumF,sumI);
    }
    void display(){
        System.out.println(feet+" Feet "+inch+" Inches");
    }
}
class Main{
    public static void main(String args[]){
    Distance d1=new Distance(10,20);
    Distance d2=new Distance(15,25);
    Distance total=d2.fun(d1);
    total.display();
    }
}