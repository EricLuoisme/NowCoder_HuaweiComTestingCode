import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex4_StrSameLenSeperate {
    public static void printArray(String str){

        ArrayList<String> list = new ArrayList<>();
        int pointer = 0;
        String temp = "";

        for (; pointer < str.length(); pointer++){
            temp += "" + str.charAt(pointer);
            if (temp.length() == 8){
                list.add(temp);
                temp = "";
            }
        }
        if (temp.length() != 8 && temp.length() != 0){
            while (temp.length() < 8){
                temp += "0";
            }
            list.add(temp);
        }

        for (String st: list){
            System.out.println(st);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String curLine = null;
        int time = 0;

        while ((curLine = bf.readLine()) != null && time < 2){
            printArray(curLine);
            time++;
        }
    }
}
