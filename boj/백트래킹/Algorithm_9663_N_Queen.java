package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_9663_N_Queen {
    public static int[] arr;
    public static int count; //개수 세기
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N]; // 열이 겹치면 안되므로 열값을 비교하기 위한 배열

        queen(0);
        System.out.println(count);
    }

    public static void queen(int k){
        if (k == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[k] = i;

            if (check(k)) {
                queen(k + 1);
            }
        }
    }



    public static boolean check(int col){ // 일직선상 또는 대각선일때 검사
        for (int i = 0; i < col; i++) {
            if(arr[col] == arr[i]){
                return false;
            } else if (Math.abs(arr[col] - arr[i]) == Math.abs(col - i)){
                return false;
            }
        }
        return true;
    }
}