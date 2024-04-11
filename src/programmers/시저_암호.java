package programmers;

public class 시저_암호 {

    public static void main(String[] args) {
        System.out.println(solution("A Z a z", 4));
    }

    public static String solution(String s, int n) {
        //s의 길이는 8000이하입니다.
        //n은 1 이상, 25이하인 자연수입니다.
        //입력값은 공백/소문자/대문자 3가지 종류임.
        //S를 char 로 바꾸고. n만큼 더해주면 된다. 그런데. z 에서 +1을 하면 A인데, 여기선 a로 반환해야함.

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }

        return sb.toString();
    }

    private static char push(char ch, int n) {
        // 알파벳이 아닌 경우
        if ( !(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) return ch;

        //대문자, 소문자 구분
        int limit = Character.isUpperCase(ch) ? 'Z' : 'z';
        int result = ch + n;

        if (result > limit) {
            result = result - 26;
        }

        return (char) result;
    }
}
