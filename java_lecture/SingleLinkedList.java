package Algorithm_FastCampus;

public class SingleLinkedList<T> {
    Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){//링크드 리스트에 데이터 추가

        if(head == null){ //헤드안에 값이 없다면
            head = new Node<T>(data);//헤드 노드에 새로운 데이터 추가
        }
        else{//헤드안에 값이 있다면
            Node<T> node = this.head;
            while (node.next != null){//node 다음 값이 null 이 아니라면
                node = node.next; //node.next 가 노드가되고 비었을때까지 찾음.
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll(){//node 전체 출력
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next!=null){
                node=node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        if(this.head == null){
            return null;
        }else {
            Node<T> node = this.head;
            while (node != null){
                if(node.data == data){
                    return node;
                }else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data,T isData){ //isData 는 어디에 넣을지 모르니 isData 앞에 넣어줘야함을 알려주는 ㅇㅇ
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null){
            this.addNode(data);
        }
        else{
        Node<T> nextNode = searchedNode.next;
        searchedNode.next = new Node<T>(data); //새로운 노드가 사이에 끼기때문에 앞의 노드는 원래 가리키던 노드를 가리키지 않고 새로운 노드를 가리켜야하므로 바꿔줌.
            searchedNode.next.next = nextNode;
        }
    }

    public boolean deleteNode(T isData){
        if(this.head ==null){
            return false; //헤드가 없다라는 것은 데이터가 없다
        }else {//헤드가 있다면
            Node<T> node = this.head; //순회해야함
            if(node.data == isData){//헤드를 삭제해야하는 경우 헤드.next에 값이와야하기때문에      헤드에 있는 노드가 해당 데이터인지를 의미
                this.head = this.head.next;
                return true;
            }else{
                while (node.next!=null){ //node의 next가 null이 아니라면
                    if(node.next.data == isData){//node.next.data가 삭제할 데이터라면
                        node.next = node.next.next;//node.next를 node.next.next로 가리켜
                        return true;
                    }
                    node = node.next;
                }
                return false;//삭제할 데이터가 없다.
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();
        singleLinkedList.addNode(1);
        System.out.println(singleLinkedList.head.data);

        singleLinkedList.addNode(2);
        System.out.println(singleLinkedList.head.next.data);

        singleLinkedList.addNode(123);

        System.out.println("-------");
        singleLinkedList.printAll();

        System.out.println("-------");
        System.out.println("SearchNode");
        singleLinkedList.addNodeInside(3,2);
        singleLinkedList.printAll();

        System.out.println("-------");
        System.out.println("DeleteNode");
        singleLinkedList.deleteNode(3);
        singleLinkedList.printAll();
    }
}
