package section2;

import java.util.Scanner;

public class Prog30 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a, rem = 0, r =0;
            for(;a!=0; a /= 10){
            rem = a % 10;
            r = r * 10+rem;
        }
        if(temp == r) System.out.println(temp+" is a palindrome number");
        else System.out.println(temp+" is a not palindrome number");
    }
}
