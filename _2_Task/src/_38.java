//Write a Java program to count total number of notes in given amount.
import java.util.Scanner;
public class _38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Amount : ");
        int amount=sc.nextInt();
        int total;

        total=amount/500;
        System.out.println("500 notes: "+total);
        amount=amount%500;

        total=amount/200;
        System.out.println("200 notes: "+total);
        amount=amount%200;

        total=amount/100;
        System.out.println("100 notes: "+total);
        amount=amount%100;

        total=amount/50;
        System.out.println("50 notes: "+total);
        amount=amount%50;

        total=amount/20;
        System.out.println("20 notes: "+total);
        amount=amount%20;

        total=amount/10;
        System.out.println("10 notes: "+total);
        amount=amount%10;

        total=amount/5;
        System.out.println("5 notes: "+total);
        amount=amount%5;

        total=amount/2;
        System.out.println("2 notes: "+total);
        amount=amount%2;

        total=amount/1;
        System.out.println("1 notes: "+total);
        //amount=amount%1;
    }
}
