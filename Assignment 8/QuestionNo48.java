import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=inp.next().toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') count++;
        }
        System.out.println("Number of vowel in given string is : "+count);

    }
}