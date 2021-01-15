package section2;

import java.util.Scanner;

public class Prog14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b = 20;
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Generating the "+a+" table");
        for (int i = 1; i <= b; i++) {
            System.out.format("%d * %d = %d \n", a, i, a * i);
        }
    }
}
