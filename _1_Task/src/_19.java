
//A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am
// are kept on a table. Which shape has more volume?
public class _19 {
    public static void main(String[] args) {
        int cube_a=7,cuboid_l=7,cuboid_w=4,cuboid_h=8;
        int cube=(cube_a*cube_a*cube_a);
        int cuboid=(cuboid_h*cuboid_w*cuboid_l);
        if(cube>cuboid)
            System.out.println("cube volume is big :"+cube);
        else
            System.out.println("cuboid volume is big :"+cuboid);

    }
}
