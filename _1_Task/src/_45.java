
//Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
public class _45 {
    public static void main(String[] args) {
        int a=-21;
        int b=-18;
        int d=b-a;
        int n=28;

        int s=(n*(2*a+(n-1)*d))/2;
        System.out.println("sum of 28 terms: "+s);

    }
}
