
//Find the cost of polishing the base of a cone whose height is 4cm
// and slant height 5 cm at the rate of 10 rs. Per sq. cm
public class _43 {
    public static void main(String[] args) {
        int l=5,h=4;
        double pie=3.14,area,cost,r;
        r=Math.sqrt((l*l)-(h*h));
        area=pie*r*r;
        cost=area*10;
        System.out.println(cost);


    }
}
