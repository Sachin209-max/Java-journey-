//Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
public class _36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        if(n%5==0)
            System.out.println("it is divisible");
        else if ( n%11==0) {

        }
        else System.out.println("not divisible");

    }
}
