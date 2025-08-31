import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number of day (1-7)");
        int day=inp.nextInt();
        switch(day){
            case 1:System.out.println("Monday"); break;
            case 2:System.out.println("Tuesday"); break;
            case 3:System.out.println("Wednesday"); break;
            case 4:System.out.println("Thusday"); break;
            case 5:System.out.println("Friday"); break;
            case 6:System.out.println("Saturday"); break;
            case 7:System.out.println("Sunday"); break;
            default:
            System.out.println("Invalid Day");
        }
    }
}