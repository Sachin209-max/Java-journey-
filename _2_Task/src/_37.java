// Write a Java program to input day number and print week day.
import java.util.Scanner;
public class _37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no :");
        int n=sc.nextInt();

        if(n==1) System.out.println("monday");
        if(n==2) System.out.println("tuesday");
        if(n==3) System.out.println("wednesday");
        if(n==4) System.out.println("thrusday");
        if(n==5) System.out.println("fridayday");
        if(n==6) System.out.println("saturday");
        if(n==7) System.out.println("sunday");



    }
}
