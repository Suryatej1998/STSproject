package section2;

import java.util.Scanner;

public class Prog24 {
    public static void main(String[] args){
        int fact = 1;
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1; i<=a; i++)
            fact *= i;
        System.out.println("The factorial of "+a+" is "+fact);
    }
}
