
//5. WAP to exchange value of two variable without using third variable
// and arithmetic operator
import java.util.Scanner;
public class _20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No : ");
        int a=sc.nextInt();
        System.out.print("Enter second no : ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " "+b);
    }
}
