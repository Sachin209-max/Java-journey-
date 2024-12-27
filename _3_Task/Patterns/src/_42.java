/*
A
BCD
EFGHI
JKLMNOP
*/
public class _42 {
    public static void main(String[] args) {
        char a='A';
        for (char i='A' ; i<='H';i=i+=2)
        {
            for (int j='A';j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }

    }
}
