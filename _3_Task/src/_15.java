//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
public class _15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n=sc.nextInt();
        int i=1,j=1;
        while (i<=n)
        {
            System.out.println(i);
            i=i+j;
            j++;
        }
    }
}