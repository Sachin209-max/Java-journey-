
//18. Ron jogs around a rectangular park of length 50 m and breadth 30 m.
// If he takes 10 rounds of the park each day, how much distance does he cover in
// a day in km?
public class _18 {
    public static void main(String[] args) {
        int l=50,b=30,round=10,perimeter;
        double km;
        perimeter=(l+b)*2;
        km=(perimeter*round)/1000.00;
        System.out.println("km :"+km);

    }
}
