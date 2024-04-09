package programmers;

public class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        System.out.println(solution(12345).toString());
    }

    public static int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }

}
