package boj.큐;

import java_lecture.ArrayQueue;

import java.util.Queue;

//queue는 삽입삭제가 많이 일어나므로 LinkedList를 많이 사용!
public class Queue_arr {
    int max = 64;
    int front; // 머리쪽에 위치하는 index 값, pop 할 때 참조하는 index
    int rear; // 꼬리쪽에 위치하는 index 값, push 할 때 참조하는 index
    int [] queue;

    public Queue_arr() {
        front = 0;
        rear = 0;
        queue = new int[max];
    }

    public boolean queueIsEmpty(){ //queue에 아무것도 들어있지 않은지 판단하는 함수
        return front == rear;
    }

    public boolean queueIsFull(){ // queue의 공간 확인
        if(rear == max -1){
            return true;
        }else{
            return false;
        }
    }

    public int size(){ // queue의 데이터 개수 확인
        return front - rear;
    }

    public void push(int value){
        if(queueIsFull()){
            System.out.println("queue is full");
            return;
        }
        queue[rear++] = value; //rear에 값을 넣어주고 rear값 증가
    }

    public int pop(){ // queue의 값 빼기
        if(queueIsEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int popValue = queue[front++];
        return popValue;
    }

    public int peek(){ // queue의 맨앞 값 확인
        if(queueIsEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int peekValue = queue[front];
        return peekValue;
    }

    public static void main(String[] args) {
        Queue_arr queue_arr = new Queue_arr();

        queue_arr.push(1);
        queue_arr.push(2);
        queue_arr.push(3);
        queue_arr.pop();

        System.out.println(queue_arr.peek());
        System.out.println(queue_arr.size());

    }
}