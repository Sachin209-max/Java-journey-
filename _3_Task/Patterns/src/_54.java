/*
 55555
  4__4
   3_3
    22
     1
*/
public class _54 {
    public static void main(String[] args) {
        for (int i=5;i>=1;i--)
        {
            for (int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(i==5 || j==1 | i==j) {
                    System.out.print(i);
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}