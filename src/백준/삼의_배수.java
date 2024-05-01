package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼의_배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int count = 0;
        while (chars.length != 1) {
            count++;
            int result = 0;
            for(int i = 0; i < chars.length; i++) {
                result += chars[i] - '0';
            }
            String str = String.valueOf(result);
            chars = str.toCharArray();
        }
        System.out.println(count);
        if (((chars[0] - '0') % 3) == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
