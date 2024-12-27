/*
     1
    1*1
   1***1
  1*****1
 111111111
*/
public class _67 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i=i+2)
        {
            for (int k=9;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(j==1 ||i==j || i==9 )
                System.out.print(" 1");
                else System.out.print(" *");
            }
            System.out.println();
        }

    }
}
