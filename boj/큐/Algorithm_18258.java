package boj.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_18258 {
    public static int[] queue;
    public static int size = 0; // 큐에 들어있는 정수의 개수를 출력한다.
    public static int front = 0; // 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int back = 0; // 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static StringBuilder sb = new StringBuilder();

    public static void push(int x){
        queue[back] = x;
        back ++; //back이 가리키는 위치를 증가시킨다.
        size ++;
    }

    public static void pop(){
        if(size == 0){
            sb.append(-1).append("\n");
        } else{
            sb.append(queue[front]).append("\n");
            size --;
            front ++; // front가 가리키는 위치를 증가시킨다.
        }
    }

    public static void size(){
        sb.append(size).append("\n");
    }

    public static void empty(){
        if(size == 0){
            sb.append(1).append("\n");
        } else{
            sb.append(0).append("\n");
        }
    }

    public static void front(){
        if(size == 0){
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
        }
    }

    public static void back(){
        if (size == 0){
            sb.append(-1).append("\n");
        } else{
            sb.append(queue[back - 1]).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        while (N -- > 0){
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
        System.out.println(sb);
    }
}
