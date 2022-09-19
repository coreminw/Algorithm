package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if(max == arr[i]){
                System.out.println(i + 1);
            }
        }
    }
}
