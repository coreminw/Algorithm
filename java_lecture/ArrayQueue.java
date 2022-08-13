package java_lecture;

public class ArrayQueue {
    int MAX = 1000;
    int front;
    int rear;
    int[] queue;

    public ArrayQueue(){
        front = 0;
        rear = 0;
        queue = new int[MAX]; //배열생성
    }

    public boolean queueIsEmpty(){ //queue 에 아무것도 들어있지 않은지 판단하는 함수
        return front ==rear;
    }

    public boolean queueIsFull(){
        if(rear == MAX -1){
            return true;
        }else
            return false;
    }

    public int size(){
        return front-rear;
    }

    public void push(int value){
        if (queueIsFull()){
            System.out.println("queue is full!");
            return;
        }
        queue[rear++] = value;
    }

    public int pop(){
        if(queueIsEmpty()){
            System.out.println("queue is empty!");
            return -1;
        }
        int popValue = queue[front++];
        return popValue;
    }

    public int peak(){
        if(queueIsEmpty()){
            System.out.println("queue is empty!");
            return -1;
        }
        int popValue = queue[front];
        return popValue;
    }

}
