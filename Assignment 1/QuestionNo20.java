class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter marks of first subject : ");
        int m1=inp.nextInt();
        System.out.print("Enter marks of second subject : ");
        int m2=inp.nextInt();
        System.out.print("Enter marks of third subject : ");
        int m3=inp.nextInt();
        System.out.print("Enter marks of fourth subject : ");
        int m4=inp.nextInt();
        System.out.print("Enter marks of fifth subject : ");
        int m5=inp.nextInt();
        float per=(float)((m1+m2+m3+m4+m5)/5f);
        if(per >=75 && per <=100)
        System.out.println("Percentage is lies between 75 and 100");
        else
        System.out.println("Percentage is not lies between 75 and 100");
    }
}