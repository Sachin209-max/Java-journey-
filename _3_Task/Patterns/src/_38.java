/*
*****
####
***
##
*
*/
public class _38 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1 || i==3 || i==5)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
