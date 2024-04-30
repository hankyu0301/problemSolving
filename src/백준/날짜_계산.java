package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜_계산 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken()); // 1~15
        int S = Integer.parseInt(st.nextToken()); // 1~28
        int M = Integer.parseInt(st.nextToken()); // 1~19

        int year = 0;
        int e = 0;
        int s = 0;
        int m = 0;

        while(true) {
            year++;
            e++;
            s++;
            m++;

            if(e > 15) {
                e = 1;
            }

            if (s > 28) {
                s = 1;
            }

            if (m > 19) {
                m = 1;
            }

            if (E == e && S == s && M == m) {
                break;
            }
        }
        System.out.println(year);
    }
}
