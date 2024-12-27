//16) …... -6	-3	0	3	6	9	……. n terms
import java.util.Scanner;
public class _14{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();

        if(n%3==0) {
            int i=-1*n;
            while (i <= n) {
                System.out.print(i+" ");
                i=i+3;
            }

        }
        else System.out.println("Try again");
    }
}