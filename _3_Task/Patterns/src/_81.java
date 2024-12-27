/*
     *
    *_*
   *_*_*
  *_*_*_*
   *_*_*
    *_*
     *
 */
public class _81 {
    public static void main(String[] args) {
        for (int i=1;i<=5; i++)
        {
            for (int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
                if(i>1&&j<i)
                {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        for (int i=4;i>=1;i--)
        {
            for (int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
                if(i>1&&j<i)
                {

                    System.out.print("_");
                }
            }
            System.out.println();
        }


    }
}
