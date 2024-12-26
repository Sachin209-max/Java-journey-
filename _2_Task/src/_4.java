/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/
import java.util.Scanner;
public class _4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Name :");
       String name= sc.nextLine();
        System.out.print("Enter your Marks :");
        int marks=sc.nextInt();
        if(marks>=80)
        {
            System.out.println("Name :"+name+" :"+"A grade");
        } else if (marks>=60 && marks<80) {
            System.out.println("Name :"+name+" :"+"B grade");
            
        } else if (marks>=50 && marks<=60) {
            System.out.println("Name :"+name+" :"+"c grade");
            
        } else if (marks>=45 && marks<=50) {
            System.out.println("Name : "+name+" :"+"D grade");
            
        } else if (marks>=25&& marks<=45) {
            System.out.println("Name :"+name+" :"+"E grade");

        }
        else
        {
            System.out.println("Name :"+name+" :"+"F grade");

        }


    }
}
