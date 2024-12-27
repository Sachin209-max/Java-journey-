//21) 1,	4,	9,	16,	25	…..
import java.util.Scanner;
public class _19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,j=3;
        while (i<=n)
        {
            System.out.println(i);
            i=i+j;
            j=j+2;
        }
    }
}
