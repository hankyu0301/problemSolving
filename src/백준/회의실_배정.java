package 백준;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실_배정 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] A = new int[N][2];

        for(int i=0; i<N; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        //입력받은 회의시간을 정렬
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                //종료시간이 같을 때
                if(S[1] == E[1]) {
                    return S[0] - E[0];
                }
                return S[1] - E[1];
            }
        });

        int count = 0;
        int end = -1;


        for (int i = 0; i <N; i++) {
            //회의시작 시간(A[i][0])이 이전 회의종료시간 A[i][1]보다 클 경우 end를 이전 회의종료시간 A[i][1]로 하고 count++
            if(A[i][0] >= end) {
                end = A[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
