/*
     A
    B B
   C  C
  D    D
 EEEEEEEEE
*/
public class _68 {
    public static void main(String[] args) {
        for (char i='A';i<='E';i++)
        {
            for (char k='E';k>=i;k--)
            {
                System.out.print(" ");
            }
            for (char j='A';j<=i;j++)
            {
                if(j=='A' ||i==j || i=='E' ) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
