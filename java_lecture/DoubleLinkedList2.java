package java_lecture;

public class DoubleLinkedList2<T> {
    public Node<T> head = null;
    public Node<T> tail = null; //doubleLinkedList 는 맨 마지막에서도 찾을 수 있게끔 tail 변수를 하나 더 설

    public class Node<T>{
        T data;
        Node<T> prev = null; // pointer 를 두개를 만들어야함.
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
            node.next.prev = node;
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
                    node = node.prev;//tail이므로 뒤로가야해서 previous
                }
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData,T addData){//노드를 추가할 수 있을때는 true 실패했을떄는 false
        //아무 중간에나 삽입을 하려면.. 양쪽에 값이 있어야하고, 양쪽의 pointer를 기반으로 넣을것..
        if(this.head == null){//첫번째로 고려해야할 점은 데이터가 아예 없을 때
            this.head = new Node<T>(addData);
            this.tail = this.head;
            return true;
        }else if(this.head.data == existedData){//existedData(존재하는데이터) 앞에 데이터를 넣으면 헤드가 바뀜! 헤드노드를 추가하고, 새로운 데이터로 추가하는경우
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;  //newHead.next를 this.head로 가리키게함(포인터)
            this.head = newHead;
            return true;
        }else{//이후에 연결 노드중에 하나가 existedData인지 확인하는 케이스
            Node<T> node = this.head; //일단 순회를함
            while (node != null){
                if(node.data == existedData){
                    Node<T> nodePrev = node.prev; //node.prev 는 앞쪽의 데이터를 가리킴

                    nodePrev.next = new Node<T>(addData); //nodePrev는 앞을 가리키고 .next 를 해주면 그 다음 데이터를 가리키는데, 추가를 해줄 데이터를 가리켜야함
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;//[prev|nodePrev|next} >< [prev|nodePrev.next|next] >< [prev|node|next]
                    node.prev = nodePrev.next;
                    return true;
                }else{//node.data 가 existedData 가 아니라면..
                    node = node.next;//순회
                }
            }
            return false;//node가 null이라면 existedData가 없는 것 이므로..
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList2<Integer> doubleLinkedList2 = new DoubleLinkedList2<Integer>();

        doubleLinkedList2.addNode(1);
        doubleLinkedList2.addNode(2);
        doubleLinkedList2.addNode(3);
        doubleLinkedList2.addNode(4);
        doubleLinkedList2.addNode(5);
        doubleLinkedList2.printAll();
        System.out.println("-------");

        doubleLinkedList2.insertToFront(3,2); //3앞에 데아터를 넣어보기
        doubleLinkedList2.printAll();
        System.out.println("-------");

        doubleLinkedList2.insertToFront(6,2);//false 6이라는 데이터 x
        doubleLinkedList2.insertToFront(1,0); // 1앞에 데이터를 넣어보기
        doubleLinkedList2.printAll();

    }

}
