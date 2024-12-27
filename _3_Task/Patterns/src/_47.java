/*
     A
    AB
   ABC
  ABCD
 ABCDE
*/
public class _47 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++)
        {
            for (char k ='E'; k>=i; k--) {

                System.out.print(" ");
            }

            for (char j = 'A'; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    }

