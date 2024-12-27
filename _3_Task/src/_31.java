//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
public class _31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,sum=0;

            while (i < n) {
                if (n % i == 0) {
                    // System.out.println(i);
                    sum = sum + i;
                }
                i++;
            }


        if(sum==n)
        {
            int a=sum;
            System.out.println(a);
            System.out.println("Perfect no");
        }
        else System.out.println("Not a perfect no");

    }
}