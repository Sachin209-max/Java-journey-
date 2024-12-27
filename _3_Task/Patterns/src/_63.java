/*
     1
    123
   12345
  1234567
 123456789
*/
public class _63 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i=i+2)
        {
            for (int k=9;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
}
