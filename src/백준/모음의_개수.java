package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모음의_개수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = {'a','e','i','o','u'};

        while(true) {
            String str = br.readLine().toLowerCase();
            if (str.equals("#")) break;
            int count = 0;
            for(char ch : str.toCharArray()) {
                for (char cha : chars) {
                    if (ch == cha) count++;
                }
            }

            System.out.println(count);
        }
    }
}
