package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        StringTokenizer st;
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); //학생의 수
            int[] arr = new int[N];
            double sum = 0; //점수의 합

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double avg = sum / N ; // 평균
            double high_avg = 0;

            for (int j = 0; j < N; j++) {
                if(arr[j] > avg){
                    high_avg ++ ;
                }
            }
            double a = (high_avg/N) * 100;

            System.out.println(String.format("%.3f", a )+"%");
        }
    }
}
