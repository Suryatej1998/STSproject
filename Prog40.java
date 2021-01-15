package section2;

import java.util.Scanner;

public class Prog40 {
    public static void main(String[] args) {
        System.out.print("Enter the limit of numbers: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min =0, max =0;
        System.out.print("Enter numbers: ");
        for(int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        min=max=a[0];
        int sum =0;
        int avg = 0;
        for(int i=0; i<n; i++) {
            if(min>a[i]) min = a[i];
            if(max<a[i]) max= a[i];
            sum = sum+a[i];
        }
        avg = sum/n;
        System.out.println("Sum of numbers in array is : "+sum);
        System.out.println("Average of numbers in array is : "+avg);
        System.out.println("Smallest Number is : "+min);
        System.out.println("Largest Number is : "+max);
    }
}
