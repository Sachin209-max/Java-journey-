/*
1
22
3 3
4  4
55555
*/
public class _21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==5 || i==j || j==1) {
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
