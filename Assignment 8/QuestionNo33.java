/* 33. Create a class MathOperation containing method ‘multiply’ to calculate
multiplication of following arguments.
a. two integers
b. three float
c. all elements of array
d. one double and one integer
*/
class MathOperation{
 int multiply(int a,int b){
    return a*b;
 }
 float multiply(float a,float b,float c){
    return a*b*c;
 }
 double multiply(double a,int b){
    return a*b;
 }
 int multiply(int arr[]){
    int mul=1;
    for(int elem:arr){
        mul*=elem;
    }
    return mul;
 }
}
class Main{
    public static void main(String args[]){
        MathOperation multi=new MathOperation();
        int arr[]={1,20,3,4,5};
        System.out.println("Int : "+multi.multiply(10,20));
        System.out.println("Float :"+multi.multiply(10.50f,11.25f,9.65f));
        System.out.println("Int and Double : "+multi.multiply(21.75,21));
        System.out.println("Array : "+multi.multiply(arr));
    }
}