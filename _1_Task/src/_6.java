// Find the area of a triangle, sides of which are 10 cm and 9 cm
// and the perimeter 36 cm.

public class _6 {
    public static void main(String[] args) {

        int a=10,b=9,c,perimeter=36;
        double area ,s;
        c=perimeter-(a+b);
        s=perimeter/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
