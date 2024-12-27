/*
a
ab
abc
abcd
abcde
*/
public class _12 {
    public static void main(String[] args) {
        for( char i=97;i<=101;i++)
        {
            for (char j=97;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
