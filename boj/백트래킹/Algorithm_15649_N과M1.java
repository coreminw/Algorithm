package boj.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Algorithm_15649_N과M1 {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth){
        if(M == depth){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visit[i]){
                visit[i] = true; // 해당 노드 방문상태로 변경한다.
                arr[depth] = i + 1; // 깊이를 index로 해서 i+1 값으로 저장한다.
                dfs(N, M, depth + 1); // 다음 자식 노드 방문을 위해 depth +1을 증가시켜 재귀로 호출한다.
                visit[i] = false; // 자식 노드의 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경한다.
            }
        }
    }
}