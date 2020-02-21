import java.util.Scanner;

public class Ex1_LastWordLen {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int count = 0;
        for (int i = text.length() - 1; i >= 0; i--){
            if (text.charAt(i) == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
