/**
 * Created by Ronald on 22-2-2016.
 */
public class Ch3_7 {
    public static void main(String args[]) {
        for(int i=0;i<10;i++){
            int n=0;
            while (true) {
                if (++n>5)
                    break;
            }
            System.out.println("after while");
        }
        System.out.println("after for");
    }
}
