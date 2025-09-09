/* 21.Create a class Alpha and Beta. Both classes contain one data member of type integer. Write a program to find which class data member is greater.*/
class Alpha{
    private int num1;
    Alpha(int num){
        num1=num;
    }
    int ret(){
        return this.num1;
    }

}
class Beta{
    private int num2;
    Beta(int num){
        num2=num;
    }
    int ret(){
        return this.num2;
    }

}
class Main{
    public static void main(String args[]){
        Alpha a=new Alpha(00);
        int val1=a.ret();
        Beta b=new Beta(0);
        int val2=b.ret();
        String str=(val1==val2) ? "Both are equal" : (val1 > val2) ? "Value of alpha is greater":"Value of beta is greater";
        System.out.println(str);
    }
}