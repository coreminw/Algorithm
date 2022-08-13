package java_lecture;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Practice1<T> {
    private Queue<T> queue = new LinkedList<T>();

    public void enqueue(T item){//enqueue 는 별다른 리턴값이 없음
        queue.add(item);
    }

    public T dequeue(){ //dequeue는 데이터를 꺼내오므로 인자는 없음
        if (queue.isEmpty()){
            return null;
        }
        return queue.poll();
    }

    public boolean inEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Queue_Practice1<Integer> qp = new Queue_Practice1<Integer>();
        qp.enqueue(1);
        qp.enqueue(2);
        qp.enqueue(3);
        System.out.print(qp.dequeue());
        System.out.print(qp.dequeue());
        System.out.print(qp.dequeue());
    }
}
