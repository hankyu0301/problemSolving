package programmers.문자열;

public class 삼진법_뒤집기 {

    /*
        n을 3진법으로 변경
        앞뒤로 뒤집기
        다시 10진법으로 표현
    */
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n) {

        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }

}
