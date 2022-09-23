package boj.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a = N;

        while (N >= 0) {
            if (N == 1) {
                break;
            } else if (N == 0) {
                a = 1;
                break;
            }
            a = a * (N - 1);
            N--;
        }
        System.out.println(a);
    }
}
