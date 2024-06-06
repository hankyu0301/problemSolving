package 백준;

import java.util.Scanner;

public class 거의_소수 {


    /*어떤 수가 소수의 N제곱(N ≥ 2) 꼴일 때, 그 수를 거의 소수라고 한다.

    두 정수 A와 B가 주어지면, A보다 크거나 같고, B보다 작거나 같은 거의 소수가 몇 개인지 출력한다.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long Min = sc.nextLong();
        long Max = sc.nextLong();

        long[] A = new long[10000001];


        for(int i = 2; i < A.length; i++) {
            A[i] = i;
        }

        // 10^14의 제곱근인 10^7까지의 소수를 탐색
        // 2 ~ 10,000,000 사이에 존재하는 모든 소수 구하기
        for(int i = 2; i <= Math.sqrt(A.length); i++) {
            if(A[i] == 0) {
                continue;
            }
            for(int j = i * 2; j <A.length; j = j+i) {
                A[j] = 0;
            }
        }

        int count = 0;

        //주어진 소수들이 Min ~ Max 범위 안에 존재하는지 판별
        for (int i = 2; i < A.length; i++) {

            if(A[i] != 0) {
                //temp -> 현재 탐색중인 소수
                //현재 소수의 제곱근이 Max보다 작을 때를 기준으로 하지만 overflow때문에 이항정리로 처리함
                long temp = A[i];
                while( (double)A[i] <= (double) Max/(double)temp) {
                    if ((double)A[i] >= (double) Min/(double) temp) {
                        count++;
                    }
                    temp = temp * A[i];
                }
            }
        }
        System.out.println(count);
    }
}
