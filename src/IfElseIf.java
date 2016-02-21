import java.util.Scanner;

/**
 * Created by ronald on 21-2-2016.
 */
public class IfElseIf {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer followed by ENTER: ");
        int i = sc.nextInt();

        if (i == 1) {
            System.out.println("your input was one");
        }
        else if (i == 2) {
            System.out.println("your input was two");
        }
        else if (i == 3) {
            System.out.println("your input was three");
        }
        else {
            System.out.println("your input was not between one and three");
        }
    }

}
