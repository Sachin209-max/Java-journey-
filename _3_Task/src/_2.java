//2) WAP to print N natural number.
import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int i = 1;
        while (n != 0) {
            System.out.println(i);
            i++;
            n--;

        }
    }
}