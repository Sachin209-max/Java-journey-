//28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….
import java.util.Scanner;
public class _26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1,j=5;
        while (i<=n)
        {
            if(i==j)
            {
                System.out.println("Hello");
                j=j+5;
            }
           else System.out.println(i);
           i++;
        }
    }
}
