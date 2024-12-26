//WAP to calculate the percentage of students
import java.util.Scanner;
public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the English Marks : ");
        int java=sc.nextInt();
        System.out.print("Enter the softSkill marks : ");
        int softSkill=sc.nextInt();
        System.out.print("Enter the Maths Marks : ");
        int math=sc.nextInt();
        double persentage=(math + softSkill + java) /3;
        System.out.println(persentage);
    }
}