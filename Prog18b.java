package section2;

import java.util.Scanner;

public class Prog18b {
    public static void main(String[] args){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int a = sc.nextInt();
        System.out.print("Even Numbers from 1 to "+a+" are: ");
        while (i <= a){
            for(i=1; i<=a; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}