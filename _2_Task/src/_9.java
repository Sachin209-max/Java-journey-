/*9. Write a program to check whether a entered character
is lowercase ( a to z ) or uppercase ( A to Z ).
 */

import java.util.Scanner;
public class _9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a character : ");
        char ch= sc.next().charAt(0);
        if(ch>=97 && ch<=123)
            System.out.println("character is small case");
        else if(ch>=65 && ch<=91)
            System.out.println("Charcter is upper case");
        else System.out.println("invalid choice");
    }
}
