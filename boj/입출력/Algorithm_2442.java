package boj.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
