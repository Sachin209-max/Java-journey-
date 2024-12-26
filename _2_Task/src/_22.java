
//7. WAP to find greater among three number
import java.util.Scanner;

public class _22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First No : ");
            int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        System.out.print("Enter Third no : ");
        int c=sc.nextInt();
        if (a > b && a>c )
            System.out.println(a + " : greater");
        else if (b>c)
            System.out.println(b + ": b is greater");
        else System.out.println(c+ " is greater");
    }
}
