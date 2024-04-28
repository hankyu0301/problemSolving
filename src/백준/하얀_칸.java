package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하얀_칸 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int result = 0;
        boolean odd = true;
        while (count < 8) {

            count++;

            char[] ch = br.readLine().toCharArray();

            for(int i = 0; i < ch.length; i++) {
                if (odd) {
                    if(i%2 == 0) {
                        if(ch[i] == 'F') result++;
                    }
                } else {
                    if(i%2 != 0) {
                        if(ch[i] == 'F') result++;
                    }
                }

            }
            odd = !odd;
        }
        System.out.println(result);
    }
}
