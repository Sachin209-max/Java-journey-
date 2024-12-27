//39) WAP to check whether entered number is strong or not
import java.util.Scanner;
public class _36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number  For Calculate Strong No : ");
        int n = sc.nextInt();
        int f=1,i=1,temp=n,sum=0;
        while (i<=n)
        {
            f=f*n;
            sum=sum+f;
            n--;
        }
        System.out.println(f);
        System.out.println(sum);
    }
}