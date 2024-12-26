/*W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to
Fahrenheit. For given problem you have to take choice from user.
If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius.
If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit.
 */
import java.util.Scanner;
public class _30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
        System.out.println("press F for Fahrenheit to Celsius :");
        System.out.println("press C for Celsius to Fahrenheit :");
        System.out.println("please enter your choice :");
        char ch=sc.next().charAt(0);
        System.out.println("Enter Temperature :");
        int tem=sc.nextInt();
        if(ch=='c'|| ch=='C')
        {   c=tem;
            System.out.println((c*9/5)+32);

        }
       else if(ch=='f' || ch=='F')
        {f=tem;
            System.out.println( (f - 32) * 5/9);
        }
       else System.out.println("invalid choice");

    }
}
