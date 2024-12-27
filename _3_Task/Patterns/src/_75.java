/*
 123456789
  1     7
   1   5
    1 3
     1
*/
public class _75 {
    public static void main(String[] args) {
        for (int i=9;i>=1;i=i-2)
        {
            for (int k=9;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(i==9 || j==1 || i==j) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
