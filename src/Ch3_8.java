/**
 * Created by Ronald on 22-2-2016.
 */
public class Ch3_8 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) {
                continue;
            }
            System.out.println();
        }
    }

}
