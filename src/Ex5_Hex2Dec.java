import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5_Hex2Dec {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = bf.readLine()) != null){
            int result = Integer.parseInt(input.substring(2), 16);
            System.out.println(result);
        }
    }
}
