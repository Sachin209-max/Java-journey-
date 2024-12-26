
//The cylinder has a volume of 1287. The base has a radius 10.
// What is the area of the surface of the cylinder?
public class _38 {
    public static void main(String[] args) {
        int v=1287,r=10;
        double area,pie=3.14,h;
        h=(v/(pie*r*r));
        area=(2*pie*r*(r+h));
        System.out.println(area);

    }
}
