package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).sorted().toArray();

        if(numbers.length == 1) {
            result = numbers[0] * numbers[0];
        } else {
            result = numbers[0] * numbers[numbers.length-1];
        }
        System.out.println(result);
    }
}
