
//49) WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;
public class _47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No you want to Start: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the End of the series No: ");
        int n2 = sc.nextInt();
        n1++;
        n2--;
        int i = 1, sum = 0;
        while (n1 < n2) {
            while (i < n1) {
                if (n1 % i == 0) {
                    sum = sum + i;
                    if (sum == n1) {
                        int a = sum;
                        System.out.println(a);
                    }
                }
                i++;
            }
        }

    }
}