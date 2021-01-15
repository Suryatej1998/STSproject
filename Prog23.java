package section2;

import java.util.Scanner;

public class Prog23 {
    public static void main(String[] args) {
        double s = 1.0;
        int i = 1, fact =1;
        System.out.print("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the x value: ");
        int x = sc.nextInt();
        while (i<=a) {
            for(int j =1; j<= i; j++){
                fact *= j;
                s += Math.pow(x,2)/fact;
            }
            i++;
        }
        System.out.print("The sum is: "+s);
    }
}
