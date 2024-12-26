
/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
*/
import java.util.Scanner;
public class _10 {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
        System.out.print("Enter a Year : ");
        int year=sc.nextInt();
        if(year%400==0)
        {
            System.out.println("Leap year");
        } else if (year%100==0) {
            System.out.println("Non leap Year");

        } else if (year%4==0) {
            System.out.println("Leap year");

        }
        else {
            System.out.println("Non leap Year");
        }
    }
}
