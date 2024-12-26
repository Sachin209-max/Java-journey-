/*Write a Java program that keeps a number from the user and generates an
 integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
*/
import java.util.Scanner;
public class _13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        if(n==1)  //Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
            System.out.println("moday");
        else if (n==2) {
            System.out.println("Tuesday");
        }
        else if (n==3)
        {
            System.out.println("WednesDay");
        }
        else if(n==4)
        {
            System.out.println("ThursDay");
        }
        else if(n==5)
        {
            System.out.println("Friday");
        }
        else if(n==6)
        {
            System.out.println("Saturday");
        }
        else System.out.println("sunDay");


    }
}
