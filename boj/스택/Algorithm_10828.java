package boj.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//push(); // 정수 x를 스택에 넣는 연산
//pop(); //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력함, 만약 스택에 정수가 없는 경우 -1 출력
//size(); // 스택에 들어있는 개수 출력
//empty(); // 스택이 비어있으면 1, 아니면 0을 출력
//top(); // 가장 위에있는 정수 출력. 스택에 들어있는 정수가 없는 경우 -1 출력

public class Algorithm_10828 {
    public static int[] stack;
    public static int size = 0; //요소의 개수

    public static void push(int item){
        stack[size] = item;
        size ++;
    }

    public static int pop(){ //파라미터가 없는 이유는 LIFO의 특성상 맨 위에꺼 바로꺼내면 되니까?
        if(size == 0){
            return -1;
        } else{
            int pop = stack[size - 1];
            stack[size - 1] = 0;
            size --;
            return pop;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size == 0){
            return 1;
        } else{
            return 0;
        }
    }

    public static int top(){
        if(size == 0){
            return -1;
        } else {
            return stack[size -1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        StringTokenizer st;
        while (N-- > 0){
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){ //push pop size empty top의 경우를 case 별로 나열
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
           }
        }
        System.out.println(sb);
    }
}
