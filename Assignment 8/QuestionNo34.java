/* 34. Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person34. 
Create and use copy constructor for above problem.
*/
class Person{
    private String name;
    private int age=18;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person(Person p){
        this.name=p.name;
        this.age=p.age;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Main{
    public static void main(String args[]){
        Person p1=new Person("Peter",20);
        p1.display();
        System.out.println("\nCopy constructor");
        Person p2=new Person(p1);
        p2.display();
    }
}