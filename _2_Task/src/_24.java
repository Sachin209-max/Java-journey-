import java.util.Scanner;

//9. WAP to check wheater number is positive or negative
public class _24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No : ");
        int n = sc.nextInt();
        if(n>0)
            System.out.println("no is positive ");
        else if (n<0)
            System.out.println("no is negative");
        else System.out.println("no is newtral");


    }
}
