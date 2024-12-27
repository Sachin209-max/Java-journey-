//31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
public class _28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=9;
        while (i<=n)
        {
            System.out.println(i);
            i=i*10+9;



        }

    }
}
