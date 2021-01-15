package section2;

import java.util.Scanner;

public class Prog34 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int temp =a;
        int big=0;
        while(a !=0 ){
            int r = a%10;
            big = Math.max(r,big);
            a /= 10;
        }
        System.out.println("The biggest digit in "+temp+" is " +big);
    }
}
