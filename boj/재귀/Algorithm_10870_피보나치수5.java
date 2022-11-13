package boj.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_10870_피보나치수5 {
    public static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        System.out.println(f(n));

    }
    public static int f(int n){
        if(n == 0){
            return 0;
        } else if(n==1){
            return 1;
        }

        return f(n-1) + f(n-2);
    }
}
