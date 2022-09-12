package boj.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_1110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int copy = N; //26
        int sum = 0;
        int a = (N / 10) + (N % 10); //8
        int b = (N % 10) * 10 + a; //68

        while(true){
            N = ((N % 10) * 10) + (((N / 10) + (N % 10))%10);
            sum ++;
            if(copy == N){
                break;
            }
        }
        System.out.println(sum);
    }
}
