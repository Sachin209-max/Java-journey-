/*Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D
*/
import java.util.Scanner;
public class _14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks=sc.nextInt();
        if(marks>90)
            System.out.println("A Grade");
        else if (marks>80 && marks<=90 ) {
            System.out.println("B Grade");
        }
        else if (marks>=60 && marks<=80 ) {
            System.out.println("c Grade");
        }
        else System.out.println("D Grade");

    }
}
