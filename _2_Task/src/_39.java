// Write a Java program to calculate profit or loss.
import java.util.Scanner;
public class _39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a price of product : ");
        int p=sc.nextInt();
        System.out.println("enter a selling price of your product : ");
        int s=sc.nextInt();
        int total;
        if(s>p) {
            total=s-p;
            System.out.println(" your profit is : "+total);
        }
        else if(s<p)
        {
            total=p-s;
            System.out.println("your loss is : "+total);

        }
        else System.out.println("you are equal");
    }
}
