package boj.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Algorithm_10871 {
    private void solutions() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] < X){
                bw.write(arr[i] + " ");
            }
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new Algorithm_10871().solutions();
    }
}
