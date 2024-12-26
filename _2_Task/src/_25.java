import java.util.Scanner;

public class _25 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a No : ");
            int n = sc.nextInt();
            if(n==1) System.out.println("one");
            if(n==2) System.out.println("Two");
            if(n==3) System.out.println("Tree");
            if(n==4) System.out.println("Four");
            if(n==5) System.out.println("Five");
            else System.out.println("invalid no");
        }
    }
