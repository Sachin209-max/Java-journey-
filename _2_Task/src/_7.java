
/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
import java.util.Scanner;
public class _7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.print("Enter your persentage :");
        int persantege =sc.nextInt();
        if(persantege>=75)
            System.out.println("you are eligible for exam");
        else
            System.out.println("you are not eligible for exam");


    }
}
