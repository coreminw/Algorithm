package Algorithm_FastCampus;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null; //doubleLinkedList 는 맨 마지막에서도 찾을 수 있게끔 tail 변수를 하나 더 설

    public class Node<T>{
        T data;
        Node<T> previous = null; // pointer 를 두개를 만들어야함.
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){//맨 끝에 데이터를 추가하는 메소드
        if(this.head == null){
            this.head = new Node<T>(data); //헤드가 null이면 head에 데이터를 추가해주고
            this.tail = this.head; //tail도 해당 노드를 가리킴
        }else{//헤드에 값이 있다면
            Node<T> node = this.head;
            while(node.next != null){//헤드노드를 기반으로 맨 끝에있는 노드를 찾기위해
                node = node.next;
            }//while문이 끝나면 node.next가 null이라는 뜻임
            node.next = new Node<T>(data);//맨 끝에있는 노드의 prev는 전을 가리켜야하므로 null이면 안되고, next는 null이어야함
            node.next.previous = node;
            this.tail = node.next;

        }
    }
    public void printAll(){
        if(this.head != null){
            Node<T> node = this.head; //head를 node로 설정하고
            System.out.println(node.data);//node의 데이터출력
            while(node.next != null){ //node를 순회한다(돌아다님)
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){//Head 부터 특정 data를 찾아보는 메소드
        if(this.head == null){//head에 데이터가 없으면
            return null;
        }else{//head에 데이터가 있으면
            Node<T> node = this.head;
            while (node != null){
                if(node.data == isData){
                    return node.data;
                }else {
                    node = node.next;//만약 끝으로갔을때는 값이 null이므로 node = null이되고, while구문이 끝나므로 값이 없다는 것을 반환하기 위해 아래에 return null;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData) {//Tail 부터 특정 data를 찾아보는 메소드
        if(this.head == null){
            return null;
        }else{
            Node<T> node = this.tail;
            while (node != null){
                if(node.data == isData){
                    return node.data;
                }else{
                    node = node.previous;//tail이므로 뒤로가야해서 previous
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addNode(1);
        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(5);
        doubleLinkedList.addNode(7);
        doubleLinkedList.addNode(9);

        doubleLinkedList.printAll();

        System.out.println("-------");
        System.out.println(doubleLinkedList.searchFromHead(1));
        System.out.println(doubleLinkedList.searchFromTail(1));
    }

}
