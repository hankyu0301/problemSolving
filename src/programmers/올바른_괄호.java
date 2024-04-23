package programmers;

import java.util.Stack;

public class 올바른_괄호 {

    class Solution {
        boolean solution(String s) {
            Stack<Character> st = new Stack<>();

            for(char ch : s.toCharArray()) {
                if(ch == '(') st.push(ch);
                else if (ch == ')') {
                    if(st.isEmpty()) {
                        return false;
                    }
                    st.pop();
                }
            }




            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return st.isEmpty();
        }
    }
}
