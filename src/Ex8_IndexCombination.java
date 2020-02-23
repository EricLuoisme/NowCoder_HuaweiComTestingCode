import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class Ex8_IndexCombination {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String curLine = null;

        while ((curLine = bf.readLine()) != null){
            int opers = Integer.parseInt(curLine);
            Map<Integer, Integer> theMap = new TreeMap<Integer, Integer>();
            for (int i = 0; i < opers; i++){
                if ((curLine = bf.readLine()) != null){
                    String[] nums = curLine.split(" ");
                    int index = Integer.parseInt(nums[0]);
                    int val = Integer.parseInt(nums[1]);
                    if (theMap.containsKey(index)){
                        theMap.put(index, theMap.get(index) + val);
                    } else {
                        theMap.put(index, val);
                    }
                }
            }
            for (Map.Entry<Integer, Integer> entry: theMap.entrySet()){
                System.out.print(entry.getKey() + " " + entry.getValue());
                System.out.println();
            }
        }
    }
}
