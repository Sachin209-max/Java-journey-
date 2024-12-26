/*Write a Java program to input basic salary of an employee and calculate its
 Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%

*/
import java.util.Scanner;
public class _41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your basic salary : ");
        int basic_salaray=sc.nextInt();
        double DA1,DA2,DA3,HRA1,HRA2,HRA3,GROSS;
        DA1=(basic_salaray*80)/100;
        DA2=(basic_salaray*90)/100;
        DA3=(basic_salaray*95)/100;
        HRA1=(basic_salaray*20)/100;
        HRA2=(basic_salaray*25)/100;
        HRA3=(basic_salaray*30)/100;
        if(basic_salaray<=10000){
            GROSS=(basic_salaray+HRA1+DA1);
            System.out.println(GROSS);

        } else if (basic_salaray<=20000) {
            GROSS=(basic_salaray+HRA2+DA2);
            System.out.println(GROSS);

        } else if (basic_salaray>20000) {
            GROSS=basic_salaray+HRA3+DA3;
            System.out.println(GROSS);
        }
        else System.out.println("Both Are equal");
    }
}
