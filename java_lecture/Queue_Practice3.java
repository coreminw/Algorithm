package Algorithm_FastCampus;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Practice3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());//queue 값 빼내기
        }
    }
}
