package section2;

import java.util.Scanner;

public class Prog27 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=a/2)
        {
            if(a%i == 0){
                sum += i;
            }
            i++;
        }
        if(sum == a) System.out.println(a+" is a perfect number");
        else System.out.println(a+ " is not a perfect number");
    }
}
