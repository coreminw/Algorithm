package boj.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int max = num;
        int min = num;

        for (int i = 0; i < n - 1; i++) {
            int num2 = Integer.parseInt(st.nextToken());
            if(num2 > max){
                max = num2;
            }
            if(num2 < min){
                min = num2;
            }
        }
        System.out.println(min + " " + max);
    }
}
