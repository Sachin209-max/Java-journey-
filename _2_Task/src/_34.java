import java.util.Scanner;

//W.A.P to check whether a charachter is an alphabet or not.
public class _34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character :");
        char ch=sc.next().charAt(0);
        if(ch>=65 && ch<=91 )
        {
            System.out.println("character");
        } else if (ch>=97 && ch<=123) {
            System.out.println("Charater");

        } else System.out.println("not a character");

    }
}
