/*
      *
     ***
    *****
   *******
    *****
     ***
      *
*/
public class _82 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i = i + 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 7; i >=1; i = i - 2) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
