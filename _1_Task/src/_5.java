// If it costs 1600 rs. to fence a rectangular park of length 20 m at the
// rate of 25 rs. per m²,find the breadth of the park and its perimeter. Also,
// find the area of the field.
public class _5 {
    public static void main(String[] args) {
        int cost=1600,length=20,rate=25;
        double bidth,perimeter;
        double area=(cost/rate);
        bidth=(area/length);
        perimeter=(length+bidth)*2;

        System.out.println("area :"+area);
        System.out.println("bidth :"+bidth);
        System.out.println("perimeter :"+perimeter);

    }
}
