//48) WAP to find out the factorial of all the numbers between two entered numbers
import java.util.Scanner;
public class _46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No you want to Start: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the End of the series No: ");
        int n2 = sc.nextInt();
        n1++;
        n2--;
        int fact = 1;
        while (n1 <= n2) {
                int i=n1;
            while (i!=0) {
                fact = fact * i;
                i--;
            }
            System.out.println(fact);
            fact = 1;
            n1++;

        }
    }
}