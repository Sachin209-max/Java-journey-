/*
     A
    ABC
   ABCDE
  ABCDEEF
 ABCDEFGHI
*/
public class _64 {
    public static void main(String[] args) {
        for (char i='A';i<='I';i+=2)
        {
            for (char k='I';k>=i;k--)
            {
                System.out.print(" ");
            }
            for (char j='A';j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }


    }
}
