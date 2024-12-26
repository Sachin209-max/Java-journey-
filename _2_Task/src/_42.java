/* Write a C program to input electricity unit charges and calculate total 
electricity bill according to the given condition: For first 50 units 
Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units 
Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is
 added to the bill.
 */
import java.util.Scanner;
public class _42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Unit of Bill : ");
        double unit=sc.nextDouble();
        double total;
        if(unit<=50)
        {
            total=unit*0.50;
            System.out.println(total);
        } else if (unit<=150) {
            total=unit*0.75;
            System.out.println(total);
            
        } else if (unit<=250) {
            total=unit*1.20;
            System.out.println(total);
            
        }  if (unit>250) {
            total=unit*1.50;
            total=(total*20)/100;
            System.out.println(total);

        }
    }
}