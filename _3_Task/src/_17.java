//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
public class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1;
        System.out.print(i);
            i=2;
            while (i <= n) {

                System.out.print(" + " + "1" + "/" + i);
                i++;
            }

         i=1;
            double j=1;
            double sum=0;
        while (i<=n) {
            sum =sum +(j/i);
            i++;
        }

        System.out.println("\n sum: "+sum);

    }
}



