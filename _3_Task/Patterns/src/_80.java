/*
1
1 2
1  3
1   4
1  3
1 2
1
*/
public class _80 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if( j==1 || i==j) {
                    System.out.print(" "+j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=3;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                if( j==1 || i==j) {
                    System.out.print(" "+j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
