/*
Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/

import java.util.Scanner;
public class _6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a value :");
        int n=sc.nextInt();
        if(n>=0)
        {
            System.out.println(n);
        } else if (n<0) {
            n=-(n);
            System.out.println(n);

        }

    }
}
