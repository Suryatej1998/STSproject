package section2;

import java.util.Scanner;

public class Prog38 {
    static final int SECONDS_PER_HOUR = 3600;
    public static void main(String[] args){
        System.out.print("Enter the time in seconds: ");
        Scanner sc=new Scanner(System.in);
        double seconds = sc.nextDouble();
        double hours = seconds / SECONDS_PER_HOUR;
        System.out.print("You hav entered "+ hours+" hours");
    }
}
