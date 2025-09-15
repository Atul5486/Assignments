class Voter{
    private int voterId,age;
    private String name;
    Voter(int voterId,String name,int age){
        if(age<18){
            System.out.println("Invalid age for voter");
        }else{
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        }
    }
    void display(){
        if(age>17){
        System.out.println("\nVoter id : "+voterId);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        }
    }
}
class Main{
    public static void main(String args[]){
        Voter v1=new Voter(101,"Peter",2);
        v1.display();
        Voter v2=new Voter(102,"Andrew",20);
        v2.display();
    }
}