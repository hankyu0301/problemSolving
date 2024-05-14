package 백준;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수_묶기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();

        int one = 0;
        int zero = 0;

        for(int i = 0; i<N; i++) {
            int a = sc.nextInt();
            if (a > 1) {
                plusPq.add(a);
            } else if (a < 0) {
                minusPq.add(a);
            } else if (a == 0) {
                zero++;
            } else if (a == 1) {
                one++;
            }
        }

        int sum = 0;

        while(plusPq.size() > 1) {
            int a = plusPq.remove();
            int b = plusPq.remove();
            sum += a*b;
        }

        while(minusPq.size() > 1) {
            int a = minusPq.remove();
            int b = minusPq.remove();
            sum += a*b;
        }

        while(!plusPq.isEmpty()) {
            sum += plusPq.remove();
        }

        while(!minusPq.isEmpty()) {
            if (zero == 0) {
                sum += minusPq.remove();
            } else {
                minusPq.remove();
                zero--;
            }
        }

        int result = sum + one;
        System.out.println(result);
    }
}
