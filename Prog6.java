package section2;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter something: ");
        char a = sc.next().charAt(0);
        if (a >= 'A' && a <= 'Z')
            System.out.println(a+" is Character in Upper Case");
        else if (a >= 'a' && a <= 'z')
            System.out.println(a+" is Character in Lower Case");
        else if (a >= '0' && a <= '9')
            System.out.println(a+" is a digit");
        else System.out.println("You have entered a Special Character");
    }
}
