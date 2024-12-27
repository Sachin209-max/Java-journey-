/*
     A
    AB
   A_C
  A__D
 ABCDE
*/
public class _49 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++)
        {
            for (char k ='E'; k>=i; k--) {

                System.out.print(" ");
            }

            for (char j = 'A'; j <= i; j++) {
                if(j=='A'||i=='E'||i==j){
                    System.out.print(j);
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }

}
