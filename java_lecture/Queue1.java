package Algorithm_FastCampus;

import java.util.LinkedList;
import java.util.Queue;


//queue 큐는 fifo로 먼저들어간게 먼저 나옴. 1을 처음 넣고 2를 넣으면 순서가 2,1...이런식..!
public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>();//integer형 queue 선언
        Queue<String> queue_str = new LinkedList<String>();//string 형 queue 선

        queue_int.add(1);//데이터 추가는 add 또는 offer를 사용함
        queue_int.offer(2);//offer는 true로 출력
        System.out.println(queue_int);

        System.out.println(queue_int.poll());//Dequeue 데이터를 꺼내는 함수
        System.out.println(queue_int);
        System.out.println(queue_int.remove());//poll()과 마찬가지로 첫번째 값을 반환 후 해당 값을 큐에서 삭제
        System.out.println(queue_int);
        System.out.println("----------");

        //큐를 잘 알려면 운영체제 공부하기..


    }
}
