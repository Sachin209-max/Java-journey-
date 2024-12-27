//10) 11) WAP to print N odd numbers.
import java.util.Scanner;
public class _10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int i=1;
        while (i<=n) {
            if (i%2!=0) {
                System.out.println(i);
            }
            i++;
        }
    }
    }
