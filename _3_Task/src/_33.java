//36) WAP to reverse a number
import java.util.Scanner;
public class _33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number you want to Reverse : ");
        int n = sc.nextInt();
        int r,sum=0,i=1;
        while (i<=n)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        System.out.println("Sum :  "+sum);
    }
}