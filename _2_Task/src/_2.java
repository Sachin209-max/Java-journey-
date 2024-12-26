
// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        double discount,quantity,price,cost;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your quantity  Here :");
         quantity=sc.nextDouble();
        System.out.println("Enter cost you want to kept :");
        cost=sc.nextDouble();
         price=quantity*cost;
        if(quantity>1000) {
            discount = (price * 10) / 100;
            price = discount+price;
            System.out.println(price);
        }
        else {
            System.out.println(price);
        }
    }
}
