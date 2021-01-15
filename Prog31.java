package section2;

import java.util.Scanner;

public class Prog31 {
    public static void main(String[] args){
        int x=0, y=1, z, i;
        System.out.print("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(x+" "+y);
        for(i = 2; i<count; i++){
            z = x+y;
            System.out.print(" "+z);
            x= y;
            y = z;
        }
    }
}
