//20) 0	7	14	21	28	35	…..
import java.util.Scanner;
public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=0;
        System.out.println(i);
        while (i<=n)
        {
            i=i+7;
            System.out.println(i);
        }
    }
}
