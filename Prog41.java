package section2;

import java.util.Scanner;

public class Prog41 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        System.out.print("Enter the digit to be searched: ");
        int a = sc.nextInt();
        int count = 0;
        while(n>0){
            count = (n%10 == a) ? count+1 : count;
            n = n/10;
        }
        System.out.println("The digit "+a+ " appears "+count+" times in "+temp);
    }
}
