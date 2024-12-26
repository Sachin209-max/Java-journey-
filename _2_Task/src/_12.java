/*.A 4 digit number is entered through keyboard. Write a program to print a new
 number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
*/
import  java.util.Scanner;
public class _12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :  ");
        int n=sc.nextInt();
        int r,sum=0;
        if(n>=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            System.out.println(sum);


        }

    }
}
