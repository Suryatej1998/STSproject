package section2;

import java.util.Scanner;

public class Prog37 {
    public static void main(String[] args){
        System.out.print("Enter the time in hours: ");
        Scanner sc=new Scanner(System.in);
        double hours = sc.nextDouble();
        double seconds = 3600 * hours;
        System.out.print("You hav entered "+(int)seconds+" seconds");
    }
}
