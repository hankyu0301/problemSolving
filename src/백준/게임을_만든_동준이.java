package 백준;

import java.util.Scanner;

public class 게임을_만든_동준이 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ans = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            for(int i = n-2; i >= 0; i--) {

                if(arr[i] >= arr[i+1]) {
                    int diff = arr[i] - arr[i+1] + 1; 
                    ans += diff;
                    arr[i] -= diff;
                }
            }
            System.out.println(ans);
        }
}
