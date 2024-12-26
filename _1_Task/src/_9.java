
//Find the area of an equilateral triangle, the length of whose sides is 12 cm.

public class _9 {
    public static void main(String[] args) {
        double area,s;
        int a=12;
        s=(3*a)/2;
        area= Math.sqrt(s*(s-a)*3);
        System.out.println(area);


    }
}
