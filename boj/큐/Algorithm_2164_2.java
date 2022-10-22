package boj.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Algorithm_2164_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        for (int i = N; i > 1; i--) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
