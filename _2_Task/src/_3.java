
/*
A company decided to give bonus of 5% to employee if his/her year
 of service is more than 5 years.Ask user for their salary and year
 of service and print the net bonus amount.
 */
import java.util.Scanner;
public class _3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double bonus;
        System.out.println("Enter your salary :");
        double salary=sc.nextDouble();
        System.out.println("enter the year of service :");
        int year=sc.nextInt();
        if(year>5)
        {
             bonus= (salary*5)/100;
            salary=salary+bonus;
            System.out.println(bonus);
        }
        else {
            System.out.println(salary);
        }


    }
}
