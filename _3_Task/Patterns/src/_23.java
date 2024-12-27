/*
a
bc
d f
g  j
klmno
*/
public class _23 {
    public static void main(String[] args) {
        for (char i='a';i<='e';i++)
        {
            for(char j='a';j<=i;j++)
            {
                if(j=='a' || i=='e' || i==j)
                {
                    System.out.print(" "+j);
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
