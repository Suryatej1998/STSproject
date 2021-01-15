package section2;

import java.util.Scanner;

public class Prog33 {
    public static void main(String[] args){
        int x=0, y=1, z, i=2;
        System.out.print("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(x+" "+y);
        do{
            z = x+y;
            System.out.print(" "+z);
            x= y;
            y = z;
            i++;
        }while(i<count);
    }
}
