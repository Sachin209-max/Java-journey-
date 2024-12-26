import java.util.Scanner;

//8. WAP to check wheather number is even or odd
public class _23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        else System.out.println("odd");
    }
}
