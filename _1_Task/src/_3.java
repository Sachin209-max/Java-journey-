import java.util.Scanner;

//    How many tiles whose length and breadth are 13
//    cm and 7 cm respectively are needed to
//    cover a rectangular region whose length and breadth are 520 cm and 140 cm?
public class _3 {
    public static void main(String[] args) {
        int tiles_length=13;
        int tiles_width=7;
        System.out.println("------respectly given ---");
        int ractangle_length=520;
        int ractangle_width=140;
        double result=(ractangle_width*ractangle_length)/(tiles_width*tiles_length);
        System.out.println("result :"+result);

    }
}
