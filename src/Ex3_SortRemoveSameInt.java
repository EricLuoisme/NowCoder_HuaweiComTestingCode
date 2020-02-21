import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_SortRemoveSameInt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int[] arr = new int[1000];
            for (int i = 0; i < n; i++) {
                arr[Integer.parseInt(br.readLine())]++;
            }
            for (int i = 0; i < 1000; i++) {
                if (arr[i] > 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
