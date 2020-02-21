import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6_PrimeFactor {

    public static String getResult(long uIDataInput){
        String result = "";
        for (long i = 2; i <= uIDataInput; i++){
            if (i == uIDataInput){
                result += String.valueOf(i) + " ";
                break;
            }
            while (uIDataInput % i == 0){
                uIDataInput /= i;
                result += String.valueOf(i) + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String curLine = null;
        while ((curLine = bf.readLine()) != null){
            String primeFactors = getResult(Long.parseLong(curLine));
            System.out.println(primeFactors);
        }
    }
}
