//25) 1	27	125	343	…………
import java.util.Scanner;
public class _23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,j=1;
        while (i<=n)
        {
            j=(i*i*i);
            System.out.println(j);
            i=i+2;
        }

    }
}