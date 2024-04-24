package programmers;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    class Solution {
        public String solution(String s) {
            String[] str = s.split(" ");
            int[] answer = Arrays.stream(str).mapToInt(Integer::valueOf).sorted().toArray();

            StringBuilder sb = new StringBuilder();
            sb.append(answer[0]).append(" ").append(answer[answer.length-1]);

            return sb.toString();
        }
    }
}
