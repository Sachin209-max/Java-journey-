//6) WAP to find out the factors of a number.
import java.util.Scanner;
public class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        int i=1;
        while (i<=(n))
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            i++;

        }
    }
}