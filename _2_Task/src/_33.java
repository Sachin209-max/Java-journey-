import java.util.Scanner;

/* W.A.P to check whether the traingle is equilateral, scalene, or isosceles.
 Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that
 has two sides of equal length. Equilateral triangle: In geometry, an equilateral
  triangle is a triangle in which all three sides are equal. Scalene triangle:
A scalene triangle is a triangle that has three unequal sides.*/
public class _33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side of triangle :");
        int a = sc.nextInt();
        System.out.print("Enter the Second side of triangle :");
        int b = sc.nextInt();
        System.out.print("Enter the Third side of triangle :");
        int c = sc.nextInt();
         if(a==b && b==c)
         {
             System.out.println("equilateral");
         } else if (a==b || b==c || a==c ) {
             System.out.println("isosceles");

         }
         else System.out.println("scalene ");
    }
}
