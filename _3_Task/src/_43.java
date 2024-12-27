//45) WAP to find out the sum of all the digits of a number
import java.util.Scanner;
public class _43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r,sum=0;
        while (n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("sum : "+sum);
    }
}
