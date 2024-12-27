//39) WAP to check whether entered number is strong or not
import java.util.Scanner;
public class _37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r,sum=0,i=1,f=1;
        while (n!=0)
        {
            r=n%10;
            while (i<=r)
            {
                f=f*r;
                r--;
            }
            sum=sum+f;
            n=n/10;
            f=1;
        }
        System.out.println(sum);
    }
}
