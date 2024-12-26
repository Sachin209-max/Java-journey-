
//   1.	 The perimeter of a rectangle is 230 cm. If the length
//   of the rectangle is 70 cm, find its breadth and area.

import java.util.Scanner;

public class _1_Question {
    public static void main(String[] args) {
        float perimeter,area,length,width;
        Scanner sc=new Scanner(System.in);
        System.out.println("--------WIDTH------");
        System.out.println("Enter the perimeter of a rectangle :");
        perimeter=sc.nextFloat();
        System.out.println("Enter the Lenght of Rectangle:");
        length=sc.nextFloat();
        width=(perimeter/2)-length;
        area=length*width;
        System.out.println("The width of ractangle is :"+width);
        System.out.println("The area of Ractangle is :"+area);

    }

}
