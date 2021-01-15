package section2;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args){
        boolean leap;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int a = sc.nextInt();
        if(a%4 == 0){
            if(a%100==0){
                if(a%400==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            System.out.println(a+" is a leap year");
        else
            System.out.println(a+" is not a leap year");
    }
}
