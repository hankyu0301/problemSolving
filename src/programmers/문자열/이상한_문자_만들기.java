package programmers.문자열;

public class 이상한_문자_만들기 {

    public static void main(String[] args) {
        System.out.println(solution("try hello world")); //"TrY HeLlO WoRlD"
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;

        for(char c : s.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                sb.append(c);
                toUpper = true;
            } else {
                if(toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }

    /*public static String solution(String s) {
        // 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < strings.length; j++) {
            //각 단어별
            char[] ch = strings[j].toCharArray();
            char result = ' ';
            for(int i = 0; i < ch.length; i++) {
                //단어의 인덱스별
                if(i % 2 == 0) {
                    result = Character.toUpperCase(ch[i]);
                } else {
                    result = Character.toLowerCase(ch[i]);
                }
                sb.append(result);
            }
            if(!(j == strings.length-1)) {
                sb.append(" ");
            }

        }

        return sb.toString();
    }*/


}
