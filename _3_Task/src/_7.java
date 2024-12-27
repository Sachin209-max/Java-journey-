//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int i = 2;
        boolean f = true;
        while (i <= n) {
            if (n % 2 == 0) {
                f = false;
                break;
            }
            i++;
        }

            if (f) {
                System.out.println("not a prime");
            } else {
                System.out.println(" prime");
            }

        }

    }