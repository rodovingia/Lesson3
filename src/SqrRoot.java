/**
 * Created by ronald on 21-2-2016.
 */
public class SqrRoot {
    public static void main(String args[]) {
        for (int n = 0; n <= 10; n++) {
            System.out.println("sqrt(" + n + ") = " + Math.sqrt(n));

        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("(i,j) = (" + i + "," + j + ")");
        }

        int[] a = {1, 3, 4, 2};
        int sum = 0;
        for (int e : a) {
            sum += e;
        }
        System.out.println("The sum is " + sum);

        {
            int[] b = {1, 3, 4, 2};
            int search = 3;
            for (int i = 0; i < b.length; i++) {
                if (b[i] == search) {
                    System.out.println(search + " found @ index " + i);
                    break;
                }
            }
        }

        {
            int[] b = {1, 3, 4, 2};

            int search = 4;
            boolean found = false;
            for (int i = 0; (!found) && (i < b.length); i++) {
                found = (b[i] == search);
                if (found)
                    System.out.println(search + " found @ index " + i);
            }
        }

        int[] b = {1, 3, 4, 2};
        int search = 2;
        boolean found = false;
        for (int i = 0; (!found) && (i < b.length); i++) {
            if (found = (b[i] == search))
                System.out.println(search + " found @ index " + i);
        }

        for (int i = 0; i < 10; i++) {
            if ((i % 2) == 1) {
                continue;
            }
            System.out.println(i + " is not odd.");
        }

    }


}
