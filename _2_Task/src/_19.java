// WAP to exchange value to two variable with third variable and without third variablb
import java.util.Scanner;
public class _19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No : ");
        int a=sc.nextInt();
        System.out.print("Enter second no : ");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print(a +" "+b);
    }
}

