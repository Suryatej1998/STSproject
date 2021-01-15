package section2;

import java.util.Scanner;

public class Prog25 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        while (temp !=0){
            temp /= 10;
            ++count;
        }
        System.out.print("There are "+count+ " digits in "+a);
    }
}
