
//1. Take values of length and breadth of a rectangle from user and check
// if it is square or not.
import java.util.Scanner;
public class _1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the length of rectangle :");
        int length=sc.nextInt();
        System.out.println("enter the breadth of rectangle :");
        int breadth=sc.nextInt();
        int area=length*breadth;
        if(length==breadth)
            System.out.println("it is square");
        else
            System.out.println("it is not square");

    }
}
