
//A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height.
// How many bricks will be used to make a wall of length 15 m,
// breadth 10 m and height 8 metres?
public class _21 {
    public static void main(String[] args) {
        double m_l=15,m_b=8,m_h=15,w_l=15*100.0,w_b=10*100.0,w_h=8*100.0;
        double measure_volume,totwl_bricks;
                measure_volume=(m_l*m_b*m_h);
        double wall_volume=(w_l*w_b*w_h);
        System.out.println(measure_volume);
        System.out.println(wall_volume);
        totwl_bricks=wall_volume/measure_volume;
        System.out.println("totwl_bricks="+totwl_bricks);




    }
}
