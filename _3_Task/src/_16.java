//18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner;
public class _16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int a=1,b=2,c,i=1;
        while (i<=n)
        {
            c=a*b;
            System.out.println(a);
            a=b;
            b=c;
            i++;
        }
    }
}