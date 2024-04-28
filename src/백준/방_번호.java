package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 방_번호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] numbers = new int[10]; // 0부터 9까지의 숫자를 저장할 배열

        for (char ch : chars) {
            numbers[ch - '0']++; // 해당 숫자의 등장 횟수 증가
        }

        // 6과 9는 서로 대응되므로, 두 수의 등장 횟수를 합쳐야 함
        int sixNineCount = (numbers[6] + numbers[9] + 1) / 2;
        numbers[6] = sixNineCount; // 6과 9 중 가장 큰 값으로 설정
        numbers[9] = sixNineCount; // 6과 9 중 가장 큰 값으로 설정

        // 가장 많이 등장한 숫자의 개수 출력
        int maxCount = 0;
        for (int count : numbers) {
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}
