//W.A.P to check whether given number is even or odd Without using % operator.
                                                                                                                             import java.util.Scanner;
public class _32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n=sc.nextInt();
        int x=n&1;

        if(x==0)
            System.out.println("even");
        else System.out.println("odd");

        }
    }

