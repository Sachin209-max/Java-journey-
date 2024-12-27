//29) 1	11	111	1111	  11111	……
import java.util.Scanner;
public class _27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,j=10;
        while (i<=n)
        {
            System.out.print(i+" ");
            i=i+j;
            j=j*10;

        }

    }
}
