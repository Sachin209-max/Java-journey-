//24) 0	4	16	36	64	…..
import java.util.Scanner;
public class _22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=0,j=1;
        while(i<=n)
        {
            j=(i*i);
            System.out.println(j);
            i=i+2;
        }
    }
}
