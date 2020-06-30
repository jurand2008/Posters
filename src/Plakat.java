import java.util.ArrayList;
import java.util.List;

public class Plakat {

    private static int n;


    static List<Integer> d;
     static List<Integer> w;

    public static void main(String[] args) {
         int width;
        int height;
        d = new ArrayList<Integer>();
        w = new ArrayList<Integer>();

        Reader read = new Reader();

        n = read.nextInt();
        for (int i = 0; i < n; i++) {
            width = read.nextInt();
            height = read.nextInt();
            d.add(width);
            w.add(height);

        }
        int postersNumber = countPosters();

        System.out.println(postersNumber);
    }

    private static int countPosters() {
        int p = 0;
        int[] s = new int[n];
        int p_add = 0;
        int number;
        for (int i = 0; i < n; i++) {
            number = w.get(i);
            while (p_add > 0 && s[p_add - 1] > number) {
                ++p;
                p_add--;
            }

                if (p_add == 0 || s[p_add - 1] < number) {
                    s[p_add++] = number;
                }

        }
        p = p + p_add;
        return p;
    }

}
