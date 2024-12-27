/*
     X
    X X
   X__X
  X____X
 X X X X X
*/
public class _61 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                if(i==5  || j==1 ||i==j) {
                    System.out.print("X");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
