
/*8. Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
import java.util.Scanner;
public class _8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("you are sick or not : ");
        char reason=sc.next().charAt(0);
        if(reason=='Y' || reason=='y' )
            System.out.println("you can sit in exam");
        else if(reason=='N' || reason=='n')
            System.out.println("you can not sit in exam");
          else System.out.println("please try again");
        }


    }

