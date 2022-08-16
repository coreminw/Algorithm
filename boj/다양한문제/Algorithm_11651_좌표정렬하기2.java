package boj.다양한문제;

import java_lecture.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm_11651_좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (arr1, arr2) -> {
            if(arr1[0] == arr2[0]){
                return arr1[1] - arr2[1];
            }else{
                return arr1[0] - arr2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append("\n");
        }
        System.out.println(sb);

    }
}
