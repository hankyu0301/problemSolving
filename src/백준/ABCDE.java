package 백준;

import java.util.ArrayList;
import java.util.Scanner;

public class ABCDE {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i ++){
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                DFS(i, 1);
            }
            if(result) break;
        }

        if (result) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void DFS(int i, int depth) {
        if(depth == 5) {
            result = true;
            return;
        }
        visited[i] = true;
        for(int next : A[i]) {
            if(!visited[next]) {
                DFS(next, depth + 1);
            }
        }
        visited[i] = false;
    }
}
