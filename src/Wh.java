import java.util.Scanner;

/**
 * Created by ronald on 21-2-2016.
 */
public class Wh {
    public static void main(String args[]) {
        char ch = 'A';

        while (ch <= 'Z') {
            System.out.print(ch);
            ch++;
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Press a key followed by Enter (use 'q' to quit): ");
            ch = sc.next(".").charAt(0);
            System.out.println("You entered character " + ch);
        } while (ch != 'q');
    }
}
