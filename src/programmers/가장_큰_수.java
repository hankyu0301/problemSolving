package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 가장_큰_수 {



    class Solution {
        public  String solution(int[] numbers) {

            List<String> result = Arrays.stream(numbers).mapToObj(String::valueOf)
                    .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                    .collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();

            for(String str : result) {
                sb.append(str);
            }

            return sb.charAt(0) == '0' ? "0" : sb.toString();
        }
    }
}
