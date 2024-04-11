package programmers.문자열;

import java.util.ArrayList;
import java.util.List;

public class 문자열_압축 {

    public static void main(String[] args) {
        System.out.println(solution("abcabcabcabcdededededede"));
    }

    public static int solution(String s) {
        int min = Integer.MAX_VALUE;
        for(int length = 1; length <= s.length(); length++) {
            int compressed = compress(s, length);
            if (compressed < min) {
                min = compressed;
            }
        }
        return min;
    }

    private static int compress(String string, int length) {
        StringBuilder sb = new StringBuilder();
        List<String> tokens = split(string, length);

        String last = "";
        int count = 0;
        for (String token : tokens) {
            if(token.equals(last)) {
                count++;
            } else {
                if (count>1) sb.append(count);
                sb.append(last);
                last = token;
                count = 1;
            }
        }
        if (count>1) sb.append(count);
        sb.append(last);
        return sb.length();
    }

    private static List<String> split(String string, int length) {
        //  1부터 ~ length까지의 길이로 나누기
        List<String> tokens = new ArrayList<>();
        for(int si = 0; si < string.length(); si +=length) {
            int ei = si + length;
            if ( ei > string.length() ) ei = string.length();
            tokens.add(string.substring(si, ei));
        }
        return tokens;
    }
}
