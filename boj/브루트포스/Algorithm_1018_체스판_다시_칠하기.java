//package boj.브루트포스;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Algorithm_1018_체스판_다시_칠하기 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        String[][] arr = new String[N][M];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                arr[i][j] = br.readLine();
//            }
//        }
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                find(i,j);
//            }
//        }
//    }
//    public static void find(int row, int col){
//
//    }
//}
