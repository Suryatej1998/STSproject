package section2;

import java.util.Scanner;

public class Prog21 {
    public static void main(String[] args) {
        double i, s = 0.0;
        System.out.print("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("The sum is: ");
        for(i=1; i<=a; i++) {
            s = s + (1/i);
        }
        System.out.print(s);
    }
}
