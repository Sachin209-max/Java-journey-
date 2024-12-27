//22) 1	8	27	64	125	…..
import java.util.Scanner;
public class _20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,j=1;
        while (i<=n)
        {
            j=(i*i*i);
            System.out.println(j);
            i++;
        }
    }
}
