package boj.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_1436_영화감독_숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N번째 영화
        int num = 666; // 첫번째 영화의 숫자
        int count = 1; // 영화 수

        while(count != N){
            num ++;
            if(Integer.toString(num).contains("666")){
                count ++;
            }
        }
        System.out.println(num);
    }

}
