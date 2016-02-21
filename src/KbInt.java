import java.util.Scanner;

/**
 * Created by ronald on 20-2-2016.
 */
public class KbInt {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer followed by ENTER: ");
        int i = sc.nextInt();

        System.out.println("Your integer is: " + i);

    }
}
