
//The length of one of the diagonals of a field in the form of a quadrilateral
// is 46 m. The perpendicular distance of the other two vertices from the
// diagonal are 13 m and 10 m, find the area of the field.
public class _14 {
    public static void main(String[] args) {

        //Area of Quadrilateral = (1/2) × Diagonal × (Sum of heights)
        int diagonal_length=46,h1=13,h2=10;
        double area=(diagonal_length*(h1+h2))/2;
        System.out.println(area);

    }
}
