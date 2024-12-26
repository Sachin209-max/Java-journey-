
//Find the area of a right angled triangle whose hypotenuse is 13 cm
// and one of its sides containing the right angle is 12 cm.
// Find the length of the other side.
public class _12 {
    public static void main(String[] args) {
        double  area,result;
        int a=12*12,b,h=13*13;
        b=h/a;
        result=Math.sqrt(b);
        area=(a*b)/2;
        System.out.println("area :"+area);
        System.out.println("other side length is :"+b);




    }
}
