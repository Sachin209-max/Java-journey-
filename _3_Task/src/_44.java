//46) WAP to find out the sum of first and last digit of a user entered number
import java.util.Scanner;
public class _44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r=1,temp=n;
        int i=1;
        while (n!=0)
        {
            r=n%10;
            n=n/10;

        }
        temp=temp%10;
        System.out.println("sum of first and last digit of no : "+(r+temp));


    }
    }