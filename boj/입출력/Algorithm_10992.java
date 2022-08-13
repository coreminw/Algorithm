package boj.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.print("*");
            return;
        }
            for (int j = 0; j < n-1 ; j++) {
                System.out.print(" ");
            }
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < n - 2; i++) {

            for (int j = 0; j < n-i-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < 2*n-1 ; i++) {
            System.out.print("*");
        }
    }
}
