
    import java.util.Scanner;
    public class _jumping_with_Switch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a letter : ");
            char ch=sc.next().charAt(0);
            switch (ch)
            {
                case 'a':
                case 'A':

                case 'e':
                case 'E':

                case 'I':
                case 'i':

                case 'O':
                case 'o':

                case 'U':
                case 'u':
                    System.out.println("vowel");
                default:
                    System.out.println("invlaid letter");

            }
        }

}
