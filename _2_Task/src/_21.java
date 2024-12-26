import java.util.Scanner;

//WAP to find greater among two number
public class _21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No : ");
        int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a+" : greater");
        else if(b>a)
            System.out.println(b+": b is greater");
        else System.out.println("both are equal");
    }
}
