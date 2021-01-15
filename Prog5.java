package section2;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int a = sc.nextInt();
        if(a>90 && a<=100) {
            System.out.println("The student is a First Rank Student");
        }
        else if(a>80 && a<=90) {
            System.out.println("The student is a Second Rank student");
        }
        else if(a>70 && a<=80) {
            System.out.println("The student is a Third Rank student");
        }
        else if(a>60 && a<=70) {
            System.out.println("The student is a Fourth Rank student");
        }
        else if(a>50 && a<=60) {
            System.out.println("The student is a Fifth Rank student");
        }
        else if(a>=40 && a<=50) {
            System.out.println("The student is just passed");
        }
        else if(a<40) {
            System.out.println("The student failed");
        }else
            System.out.println("Invalid Mark");
    }
}
