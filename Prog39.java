package section2;

import java.util.Scanner;

public class Prog39 {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println(a + " is a prime number.");
        else System.out.println(a + " is not a prime number.");
    }
}
