package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        Double A = Double.valueOf(strs[0]);
        Double B = Double.valueOf(strs[1]);
        System.out.println(A/B);
    }
}
