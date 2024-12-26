
//23. Find the number of cubical boxes of cubical side 3 cm which can be
// accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
public class _23 {
    public static void main(String[] args) {
        int c_a=15,c_b=9,c_c=12,n_b=3,v1,v2;
        v1=n_b*n_b*n_b;
        v2=c_a*c_b*c_c;
        System.out.println("no of cubical boxes :"+v2/v1);


    }
}
