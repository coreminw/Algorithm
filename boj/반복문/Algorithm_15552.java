package boj.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Algorithm_15552 {
    private void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
        }

        bw.flush();package boj.반복문;

import java.io.*;
import java.util.StringTokenizer;

        public class Algorithm_15552 {
            private void solution() throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                int T = Integer.parseInt(br.readLine());

                for (int i = 0; i < T; i++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    int A = Integer.parseInt(st.nextToken());
                    int B = Integer.parseInt(st.nextToken());
                    bw.write(A + B + "\n");
                }

                bw.flush();
                bw.close();
            }

            public static void main(String[] args) throws IOException{
                new boj.반복문.Algorithm_15552().solution();
            }
        }

        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new Algorithm_15552().solution();
    }
}
