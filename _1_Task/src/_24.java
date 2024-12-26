
//24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be
// required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell
// at $900 per thousand what will it cost to build the wall?
public class _24 {
    public static void main(String[] args) {
        double l=25,w=10,h=7.5,volume_bricks;
        double w_l=20,w_h=2,w_w=0.75,volume_wall,total_no_bricks;
        volume_bricks=(l*w*h);
        volume_wall=(w_l*w_h*w_h)*1000000;
        total_no_bricks=(volume_wall/volume_bricks)*0.9;
        System.out.println(total_no_bricks);

    }
}
