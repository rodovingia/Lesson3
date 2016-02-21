/**
 * Created by ronald on 20-2-2016.
 */
public class KbIn {

    public static void main(String args[]) throws java.io.IOException {

        char ch;

        System.out.println("Enter a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a character from the keyboard

        System.out.println("Your key is: " + ch);

    }
}
