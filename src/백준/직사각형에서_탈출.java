package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 직사각형에서_탈출 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();

        int X = nums[0];
        int Y = nums[1];
        int W = nums[2];
        int H = nums[3];

        int x_min = Math.min(X, W-X);	// x축 최소거리
        int y_min = Math.min(Y, H-Y);	// y축 최소거리

        // x와 y축 최소거리 중 가장 작은 값
        System.out.println(Math.min(x_min, y_min));

    }
}
