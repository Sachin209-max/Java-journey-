
//The area of a rectangle is 96 cm². If the breadth
// of the rectangle is 8 cm, find its length and perimeter.
import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float perimeter,area,length,breadth;

        System.out.println("Enter the area of a rectangle :");
        area=sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle:");
        breadth=sc.nextFloat();
        length=(area/breadth);
        perimeter=2*(length+breadth);
        System.out.println("length"+length);
        System.out.println("perimeter is :"+perimeter);

    }
}
