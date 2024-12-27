//38) WAP to check whether entered number is Armstrong or not
import java.util.Scanner;
public class _35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r,sum=0,i=1,temp=n;
        while (i<=n)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("No is Armstrong");
        }
        else System.out.println("Not A Armstrong");
    }
}