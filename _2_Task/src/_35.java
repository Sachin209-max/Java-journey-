//Java program to check whether the triangle is valid or not if angles
// are given. Hint:- The angle property of the triangle says that the sum of
// all three angles should be equal to 180.
import java.util.Scanner;
public class _35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First angle of traingle :");
        int a=sc.nextInt();
        System.out.print("Enter the Second angle of traingle :");
        int b=sc.nextInt();
        System.out.print("Enter the Third angle of traingle :");
        int c=sc.nextInt();
        int total=a+b+c;
        if(total==180)
        {
            System.out.println("valid traingle");
        }
        else System.out.println("invalid traingle");

    }
}
