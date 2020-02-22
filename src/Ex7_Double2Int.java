import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7_Double2Int {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String curLine = null;

        while ((curLine = bf.readLine()) != null){
            double input = Double.parseDouble(curLine);
            System.out.println(Math.round(input));
        }
    }
}
