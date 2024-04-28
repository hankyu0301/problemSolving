package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 그룹_단어_체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;


        Set<Character> characterSet;
        for(int i = 0; i < N; i++) {
            boolean result = true;
            char prev = 0;
            characterSet = new HashSet<>();
            char[] chars = br.readLine().toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if ( prev != chars[j] ) {

                    if( characterSet.contains(chars[j]) ) {
                        result = false;
                        break;
                    } else {
                        characterSet.add(chars[j]);
                    }

                }
                prev = chars[j];
            }

            if(result) count++;

        }
        System.out.println(count);
    }
}
