package boj.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());

        if(M+T<60){
            System.out.println(H + " " + (M+T));
        } else{ // M + T가 60 이상이면
            H += (M + T)/60; // 60분이 넘으면 시간으로 환산을 해줘야하니..
            if (H>23){ //23시가 넘으면 0시로 바꿔줘야함
                H = H -24;
                System.out.println(H + " " + (M+T)%60); //23에서 0으로 만들때의 1이 빠지니 -1
            } else{
                System.out.println(H + " " + (M+T)%60); //23시가 넘지 않으면  그대로 출력
            }
        }
    }
}
