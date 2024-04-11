package programmers;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        String str = String.valueOf(n); // "12345" -> [ '5', '4', '3', '2', '1' ]
        int[] nums = new int[str.length()]; // [ '1','2','3','4','5' ]
        int index = 0;

        for(int i = str.length(); i>0; i--) {
            nums[index] = str.charAt(i-1) - '0'; // 문자열을 int로 형변환하면 안돼.
            index++;
        }

        return nums;
    }

}
