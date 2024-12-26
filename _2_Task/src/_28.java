//Program to perform arithmetic operation using switch case
import java.util.Scanner;
public class _28 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("press 1 for add : 1 :");
        System.out.println("press 1 for sub : 2 :");
        System.out.println("press 1 for mul : 3 :");
        System.out.println("press 1 for div : 4 : ");
        System.out.print("Enter a choice :");
        int ch=sc.nextInt();
        int a,b;
        if(ch<=4) {
            System.out.print("enter first no :");
            a=sc.nextInt();
            System.out.print("Enter Second No :");
            b=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("add :" + (a + b));
                    break;
                case 2:
                    System.out.println("sub :" + (a - b));
                    break;
                case 3:
                    System.out.println("mul :" + (a * b));
                    break;
                case 4:
                    System.out.println("div :" + (a / b));

            }
        }
        else {
            System.out.println("Invalid no please try again");
        }


    }
}
