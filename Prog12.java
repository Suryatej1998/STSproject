package section2;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = sc.nextDouble();
        System.out.print("Enter second number: ");
        y = sc.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch(op) {
            case '+': z = x + y;
                break;
            case '-': z = y - x;
                break;
            case '*': z = x * y;
                break;
            case '/': z = x / y;
                break;
            default: System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.println(x + " " + op + " " + y + " = " + z);
    }
}
