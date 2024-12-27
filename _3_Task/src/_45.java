//47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
public class _45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No you want to Start: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the End of the series No: ");
        int n2 = sc.nextInt();
        n1++;
        n2--;
        while (n1<= n2){
            int i =1;
            while(i <= 10){
                System.out.print(i*n1+" ");
                i++;
            }
            System.out.println(" ");
            n1++;
        }

    }
}