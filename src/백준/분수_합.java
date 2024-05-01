package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분수_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        
        int sumX = (x1*y2) + (x2*y1);
        int sumY = y1*y2;
        
        int gcd = gcd(sumY, sumX);

        int x = sumX / gcd;
        int y = sumY / gcd;

        System.out.println(x + " " + y);
    }

    private static int gcd(int a, int b) {
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}
