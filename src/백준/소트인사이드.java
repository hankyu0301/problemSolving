package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split("")).mapToInt(Integer::valueOf).sorted().toArray();

        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}
