package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] prefixSum = new long[M];
        long count = 0;
        st = new StringTokenizer(br.readLine());

        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            currentSum = (currentSum + num) % M;

            if (currentSum == 0) {
                count++; // 현재까지의 부분합이 M으로 나누어 떨어지는 경우
            }

            count += prefixSum[currentSum]; // 이전까지의 부분합 중에서 나머지가 같은 경우를 더함
            prefixSum[currentSum]++; // 현재까지의 부분합을 나머지에 대한 빈도수로 저장
        }

        System.out.println(count);
    }
}