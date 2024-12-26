
//. How many bricks will be required to lay a path 120 m long and 2.4 m
// breadth if a brick is 24 cm long and 15 cm wide?
public class _26 {
    public static void main(String[] args) {
        double l=120*100.0,b=2.4*100.0,b_l=24,b_b=15,area_new,area_old;
        area_old=(l*b);
        area_new=b_b*b_l;
        System.out.println(area_old/area_new);



    }
}
