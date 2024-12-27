//41) WAP to find out LCM of a number
import java.util.Scanner;
public class _39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(6/6);
        int i=1,m=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                m=m*i;
                System.out.println(m);
            }
            i++;

        }
        System.out.println(m);
    }
}