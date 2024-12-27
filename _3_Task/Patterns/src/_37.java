/*
ABCDE
A  D
A C
AB
A
*/
public class _37 {
    public static void main(String[] args) {
        for(char i='E';i>='A';i--) {
            for (char j = 'A'; j <= i; j++) {
                if (i == j || j == 'A' ||i==j || i=='E') {
                    System.out.print(" "+j);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
