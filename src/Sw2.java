import java.util.Scanner;

/**
 * Created by ronald on 21-2-2016.
 */
public class Sw2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a traffic light color followed by ENTER: ");
        String color = sc.next();

        switch (color) {
            case "green": {
                System.out.println("Go, the traffic light is " + color);
                break;
            }
            case "amber": {
                System.out.println("Slow down, the traffic light is " + color);
                break;
            }
            case "red": {
                System.out.println("Stop, the traffic light is " + color);
                break;
            }
            default: {
                System.out.println("Error: the traffic light has a strange color");
            }
        }
    }
}
