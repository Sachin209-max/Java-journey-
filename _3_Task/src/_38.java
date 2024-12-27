//40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
public class _38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int count1=0,count2=0,i=1,r;
        while (n!=0)
        {
            r=n%10;
                if (r%2 == 0) {
                    count1++;
                } else count2++;
                n=n/10;

            }
        System.out.println("Even No count is : "+count1);
        System.out.println("Odd No count is : "+count2);
        }


    }


/* while (n!=0)
        {
                if(n%2==0)
        {
count1++;
        }
        else count2++;
         n--;
        }*/