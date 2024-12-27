import java.util.Scanner;
public class _42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r,temp=n;
        int m=0,i=1;
        while (n!=0)
        {
            r=n%10;
            n=n/10;
            m=r;
        }
        temp=temp%10;
        System.out.println(m);
        System.out.println(temp);






    }
}