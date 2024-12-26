/*11. Ask user to enter age, sex ( M or F ), marital status ( Y or N )
and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".
*/
import java.util.Scanner;
public class _11 {
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System .in);
        System.out.print("Enter your age : ");
        int age =sc.nextInt();
        System.out.print("enter you sex :");
        String sex=sc.next();
        System.out.print("Enter Material Status : ");
        char ch=sc.next().charAt(0);
        if(sex.equalsIgnoreCase("Female") || sex.equalsIgnoreCase("female"))
            System.out.print("you work urban areas");
      //  if employee is a male and age is in between 20 to 40 then he may work in anywhere

        else if ((sex.equalsIgnoreCase("MALE") || sex.equalsIgnoreCase("male")) &&(age>=20 && age<=40 ) ){
        System.out.println("you work in anywhere");
        }
        else if((sex.equalsIgnoreCase("MALE") || sex.equalsIgnoreCase("male")) &&(age>=40 && age<=60 ))
        {
            System.out.println("you will work in urban areas only");
        }
        else
        {System.out.println("ERROR Please Try Again");}

    }
}
