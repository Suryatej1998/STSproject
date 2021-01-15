package section2;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        System.out.print("Enter y value: ");
        int y = sc.nextInt();
        if (x == 0 && y == 0)
            System.out.println("("+x+","+y+")"+" lies on the Origin");
        else if (x == 0)
            System.out.println("("+x+","+y+")"+" lies on y axis");
        else if (y == 0)
            System.out.println("("+x+","+y+")"+" lies on x axis");
        else System.out.println("("+x+","+y+")"+" lies neither on x axis nor on y axis");
    }
}
