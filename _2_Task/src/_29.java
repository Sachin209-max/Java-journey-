import java.util.Scanner;

//WAP to find lowest number among four different number
public class _29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No :");
        int a=sc.nextInt();
        System.out.print("Enter Second No :");
        int b=sc.nextInt();
        System.out.print("Enter Third No :");
        int c=sc.nextInt();
        System.out.print("Enter Fourth No :");
        int d=sc.nextInt();
        if(a<b && a<c && a<d)
            System.out.println("A is lowest No");
        else if(b<c && b<d )
            System.out.println("B is lowest");
       else if(c<d)
            System.out.println("C is lowest");
        else System.out.println(" D is lowest");
    }
}
