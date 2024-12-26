
//The base and height of a triangle are in the ratio 8 : 5 and
// its area is 320 m². Find the height and base of the triangle.
public class _11 {
    public static void main(String[] args) {
        double base=8,height=5,area=320,result;
        double x;
         x=(area*2)/(base*height);
       result=Math.sqrt(x);
        base=base*result;
        height=height*result;
        System.out.println(base);
        System.out.println(height);



    }
}
