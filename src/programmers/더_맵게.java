package programmers;

import java.util.PriorityQueue;

public class 더_맵게 {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : scoville) {
            pq.offer(i);
        }

        int count = 0;

        while(pq.peek() < K) {

            if (pq.size() < 2) {
                return -1;
            }

            pq.offer(pq.poll() + (pq.poll() * 2));
            count++;
        }

        return count;
    }
}
