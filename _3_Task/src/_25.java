//27) *	#	*	#	*	#	*	#	*	…….
import java.util.Scanner;
public class _25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Term you want to print : ");
        int n = sc.nextInt();
        int i=1;
        String st="*",st1="#";
        while (i<=n)
        {
            System.out.print(" "+st+" "+" "+st1);
            i++;
        }
    }
}