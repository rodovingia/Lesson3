/**
 * Created by ronald on 20-2-2016.
 */
public class KbIn2 {

    public static void main(String args[]) throws java.io.IOException {

        int i;

        System.out.println("Enter a key followed by ENTER: ");

        i = System.in.read(); // get a character from the keyboard

        System.out.println("Your key is: " + i);

    }
}
