package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 이분_그래프 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean isEven;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        // 테스트 케이스
        int K = Integer.parseInt(br.readLine());

        //테스트 케이스만큼 반복
        for(int i = 0; i < K; i++) {
            input = br.readLine().split(" ");

            //V -> 정점의 수, E -> 에지의 수
            int V = Integer.parseInt(input[0]);
            int E = Integer.parseInt(input[1]);

            // 자료구조 크기를 정점의 수만큼 설정해줌
            A = new ArrayList[V+1];
            visited = new boolean[V+1];
            check = new int[V+1];
            isEven = true;

            for(int j = 1; j < V+1; j++) {
                A[j] = new ArrayList<Integer>();
            }

            for(int j = 0; j < E; j++) {
                input = br.readLine().split(" ");
                int s = Integer.parseInt(input[0]);
                int e = Integer.parseInt(input[1]);
                A[s].add(e);
                A[e].add(s);
            }

            for(int j = 1; j < V+1; j++) {
                if(isEven) {
                    if(!visited[j])
                        DFS(j);
                } else {
                    break;
                }
            }

            if(isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static void DFS(int now) {
        visited[now] = true;
        for(int next : A[now]) {
            if(!visited[next]) {
                check[next] = (check[now] + 1) % 2;
                DFS(next);
            } else if(check[next] == check[now]) {
                isEven = false;
            }
        }
    }
}
