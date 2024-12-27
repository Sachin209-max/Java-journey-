//8) WAP to print Fibonacci series.
import java.util.Scanner;
public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int a=0,b=1,c,i=1;
        while (i<=n)
        {
            c=a+b;
            System.out.print(" "+a);
            a=b;
            b=c;
            i++;
        }
    }
}