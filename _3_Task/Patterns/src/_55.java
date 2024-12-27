/*
 ABCDE
  A__D
   A_C
    AB
     A
*/
public class _55 {
    public static void main(String[] args) {
        for (char i = 'E'; i >='A'; i--) {
            for (char k = 'E'; k>=i; k--) {

                System.out.print(" ");
            }

            for (char j = 'A'; j <= i; j++) {
                if (j == 'A' || i == 'E' || i == j) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
