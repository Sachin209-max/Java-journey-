import java.util.Scanner;
public class _48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No you want to Start: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the End of the series No: ");
        int n2 = sc.nextInt();
        n1++;
        n2--;
        int r,sum=0,i=1,a,temp=n1;
        while (n1<=n2) {
            while (i <= n1) {
                r = n1 % 10;
                sum = sum * 10 + r;
                n1 = n1 / 10;
            }
            if(sum==temp)
            {
                a=temp;
                System.out.println(temp);
            }
                n1++;

        }
    }
}
