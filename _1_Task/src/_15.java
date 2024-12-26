
//  Shelly has a rectangular garden of length 22 m and breath 15 m.
//  Her friend Rachel has a square garden of side 21 m. Whose garden is
//  bigger and by how much?
public class _15 {
    public static void main(String[] args) {
        int _rectangle_length=22,_rectangle_breath=15,area_of_rectangle,area_of_square;
            int side_of_squre=21,result;
        area_of_rectangle=_rectangle_length*_rectangle_breath;
        area_of_square=side_of_squre*side_of_squre;
        if(area_of_rectangle>area_of_square)
        {
            result=(area_of_rectangle)-(area_of_square);
            System.out.println("area_of_rectangle is bigger ="+result);
        }

        else if(area_of_square>area_of_rectangle)
        {
            result=(area_of_square)-(area_of_rectangle);
            System.out.println("area_of_square is bigger ="+result);

        }


    }
}
