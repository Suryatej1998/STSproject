package section2;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a%3 == 0 && a%5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        }
        else {
            System.out.println("The number is not divisible by both 3 and 5");
        }
    }
}
