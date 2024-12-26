/*Write a program to input choice from user. If user enter ‘+’ as choice
then calculate addition of 2 number. If Choice ‘>’ then check which number
 is greaterst. If choice is ‘==’ then check both number is equal or not.
 */
import java.util.Scanner;
public class _43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente a value : ");
        int a = sc.nextInt();
        System.out.println("enter next value : ");
        int b = sc.nextInt();
        System.out.println("enter a symbol");
        char st = sc.next().charAt(0);
        if (st == '+')
            System.out.println(a + b);
        else if (st == '>')
            if (a > b) System.out.println(a);
            else System.out.println(b);
        else if (st == st)
            System.out.println("both are equal");


        }

}
