//3) WAP to find out the sum of N natural number.
import java.util.Scanner;
public class _3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n=sc.nextInt();
        int sum=0, i=1;
        while (n!=0)
        {
            sum=sum+i;
            i++;
            n--;
        }
        System.out.println("Sum : "+sum);

    }
}
