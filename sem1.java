// Дан массив чисел, требуется получить новую выборку только четных чисел
import java.util.Arrays;

public class sem1 {

    public static void main(String [] args) {
        int[] arr = new int []{ 5, 3, 4, 654, 43, 32 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getEvenNums(arr)));
    }

    public static int[] getEvenNums(int[] args) {
        int len = (args.length) % 2 == 0 ? args.length / 2 : args.length / 2 + 1;
        int j = 0;
        int[] res = new int[len];
        for (int i = 0; i < args.length; i++) {
            if (args[i] % 2 == 0) {
                res[j] = args[i];
                j++;
            }
        }
        return res;
    }
}