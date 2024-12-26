//11. Find even odd using switch case
import java.util.Scanner;
public class _26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();

        switch (n&1) {
            case 1:
                System.out.println("No is odd");break;
            case 0:
                System.out.println("No is even");break;


            default:
                System.out.println("Invalid no : ");

        }
    }
}

