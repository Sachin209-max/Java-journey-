/*
 A B C D E
  A B C D
   A B C
    A B
     A
*/
public class _73 {
    public static void main(String[] args) {
        for ( char i='E';i>='A';i--)
        {
            for (char k='E';k>=i;k--)
            {
                System.out.print(" ");
            }
            for (char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
