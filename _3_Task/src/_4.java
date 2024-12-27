//4) WAP to print table of a number.
import java.util.Scanner;
public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int i=1,sum=0;
        while (i<=10)
        {
            sum=n*i;
            System.out.println(sum);
            i++;
        }
    }
}