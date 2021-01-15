package section2;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value: ");
        int x = sc.nextInt();
        System.out.print("Enter second value: ");
        int y = sc.nextInt();
        int z = (x>y)? x: y;
        System.out.println(z+" is greater");
    }
}
