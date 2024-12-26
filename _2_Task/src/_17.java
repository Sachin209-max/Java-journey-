
//WAP to calculate area of rectangle
import java.util.Scanner;
public class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int l=sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int w=sc.nextInt();
        int area=l*w;
        System.out.println(area);
    }
}