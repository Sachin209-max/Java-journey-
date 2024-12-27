//37) WAP to check whether entered number is palindrome or not
import java.util.Scanner;
public class _34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r,sum=0,i=1,temp=n;
        while (i<=n)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("No is palindrome ");
        }
        else System.out.println("Not a palindrome");
    }
}