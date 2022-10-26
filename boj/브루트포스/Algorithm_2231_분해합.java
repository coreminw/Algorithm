package boj.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_2231_분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력 및 분해합
        int res = 0;
        for (int i = 0; i < N; i++) {
            int num = i; // 생성자 설정
            int sum = 0;

            while(num != 0){
                sum += num % 10;
                num = num/10;
            }

            if(sum + i == N){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}