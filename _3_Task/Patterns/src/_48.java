/*
1
11
1*1
1**1
11111
*/
public class _48 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++) {
                if (  i == 5 || i==j|| j == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
