
//Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
public class _5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age of first person :");
        int a= sc.nextInt();
        System.out.println("Enter the age of Second Preson :");
        int b=sc.nextInt();
        System.out.println("enter the age of third person :");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is oldest");
        } else if (b>a && b>c) {
            System.out.println("B is oldest");

        } else if (c>a && c>b) {
            System.out.println("C is oldest");

        }
        else {
            System.out.println("All are equals");
        }

        if(a<b && a<c)
        {
            System.out.println("A is younger");
        } else if (b<a && b<c) {
            System.out.println("B is younger");

        } else if (c<a && c<b) {
            System.out.println("C is younger");

        }
        else {
            System.out.println("All are equals");
        }

    }
}
