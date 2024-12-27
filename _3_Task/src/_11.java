//13) WAP to print N natural numbers in reverse order
import java.util.Scanner;
public class _11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        while (n>=1)
        {
            System.out.println(n);
            n--;
        }

    }
}