/*
 *
 **
 ****
 *******
 ***********
*/
public class _41 {
    public static void main(String[] args) {

        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=11;j++)
            {
                if(j<=a) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            a=a+i;
            System.out.println();
        }

    }
}
