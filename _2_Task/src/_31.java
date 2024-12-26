import java.util.Scanner;

public class _31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("+");
        } else if (n < 0) {
            System.out.println("-");

        } else {
            System.out.println("0");
        }
    }
}