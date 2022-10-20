package boj.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N*2];

        for (int i = 1; i <= N; i++) {
            queue[i] = i;
        }

        //원소가 1부터 N까지 있다고 가정함.
        int front = 1;
        int rear = N;

        for (int i = N; i > 1 ; i--) {
            front ++; //삭제할 필요 x front가 가리키는 첫번째 원소를 다음 원소로 변경

            queue[rear +1] = queue[front]; //마지막 원소 다음공간에 첫번째 원소 데이터를 삽입한다.

            //각각의 변수가 가리키는 index를 1씩 증가시킴.
            rear ++;
            front ++;
        }
        System.out.println(queue[front]);


    }
}
