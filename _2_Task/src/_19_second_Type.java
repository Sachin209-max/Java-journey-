//    // WAP to exchange value to two variable with third variable  third variablb
import java.util.Scanner;
public class _19_second_Type {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First No : ");
            int a=sc.nextInt();
            System.out.print("Enter second no : ");
            int b=sc.nextInt();
            int c;
            c=a^b;
            a=c^a;
            b=c^a;
            System.out.print(a +" "+b);
        }
    }



