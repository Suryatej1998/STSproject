package section2;

import java.util.Scanner;

public class Prog28 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0 && a <10 ) System.out.println(a+" is in the range");
        else if(a<0 || a>10) System.out.println(a+" is out range");
        else System.out.println(a+" is invalid");
    }
}
