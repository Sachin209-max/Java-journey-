//35) WAP to count number of digits
import java.util.Scanner;
public class _32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int count=0,r;
        while (n!=0)
        {
            r=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Count : "+count);
    }
}