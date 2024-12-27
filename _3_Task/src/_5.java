// 5) WAP to find out the factorial of a number.
import java.util.Scanner;
public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n= sc.nextInt();
        int fact=1;
        while (n!=1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}