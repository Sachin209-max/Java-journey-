/*
    1
   12
  123
 1234
  123
   12
    1
*/
public class _79 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for (int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=3;i>=1;i--)
        {
            for (int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
