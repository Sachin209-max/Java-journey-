/*Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following:
	Percentage >= 90% : Grade A
	Percentage >= 80% : Grade B
	Percentage >= 70% : Grade C
	Percentage >= 60% : Grade D
	Percentage >= 40% : Grade E
	Percentage < 40% : Grade F
*/
import java.util.Scanner;
public class _40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks of P : ");
        int p=sc.nextInt();
        System.out.print("enter marks of c : ");
        int c=sc.nextInt();
        System.out.print("enter marks of m : ");
        int m=sc.nextInt();
        System.out.print("enter marks of b : ");
        int b=sc.nextInt();
        System.out.print("enter marks of com : ");
        int com=sc.nextInt();
        int total=(p+c+m+b+com)/5;
        if(total>=90)
            System.out.println("A grade");
        else if (total>=80) {
            System.out.println("B grade");
            
        } else if (total>=70) {
            System.out.println("C grade");
        }
        else if(total>=60)
            System.out.println("D grade");
        else if (total>=40) {

            System.out.println("E grade");
        }
        else System.out.println("F grade");

    }
}
