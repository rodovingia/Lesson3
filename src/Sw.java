import java.util.Scanner;

/**
 * Created by ronald on 21-2-2016.
 */
public class Sw {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer followed by ENTER: ");
        int i = sc.nextInt();

        switch (i) {
            case 1: {
                System.out.println("your input was one");
                break;
            }
            case 2: {
                System.out.println("your input was two");
                break;
            }
            case 3: {
                System.out.println("your input was three");
                break;
            }
            default: {
                System.out.println("your input was not between one and three");
            }
        }
    }
}
