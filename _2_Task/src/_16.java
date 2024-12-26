
//WAP to calculate area of circle
import java.util.Scanner;
public class _16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle :");
        double r=sc.nextDouble();
        double area,pi=3.14;
        area=pi*(r*r);
        System.out.println(area);

    }
}