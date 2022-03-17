// Chaining 기법은 hash에서 개방 해슁 또는 Open Hashing 기법 중 하나.
// 해쉬 테이블 저장공간 외의 공간을 활용하는 기법
// 구현하기 위해 slot클래스와 데이터저장메소드, 데이터를 가져오는 메소드를 수정해야함.
// 특정 slot을 접근해도 내 키에 대응하는 데이터인지 아니면 그 뒤에 연결된 링크드리스트중에 내 키에 대응하는 값이 있는지 확인해야하기 때문.

public class ChainingHash {
    public ChainingHash.Slot[] hashTable; // Slot이라는 클래스를 기반으로 한 객체 배열을 만들 수 있는 변수 hashtable 생성

    public ChainingHash(Integer size){//생성자
        this.hashTable = new ChainingHash.Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot next; // LinkedList 를 만들어줘야하기때문에 next와 같이 포인터도 만들어줘야함
        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key){//hashFunction 만들기
        return (int)(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){//저장을 했는지 판별하는 메소드
        Integer address = this.hashFunc(key);//맨처음에는 해당 데이터를 저장할 수 있는 주소를 가져와야함
        if(this.hashTable[address]!= null){//이미 한 번 데이터가 저장되어있음
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address]; //데이터가 있을 때 링크드리스트로 순회를 해야하기때문에 두개의 변수를 만들어줌
            // 처음에는 둘다 맨 앞에있는 슬롯을 가지게 되고 링크드리스트의 헤드로 설정했다라고 생각하면 됨.
            while(findSlot !=null){
                if(findSlot.key == key){// 내가 찾는 키가 있다면 이미 내 키에 해당하는 데이터에 저장이 되어있다라는 것이고, 내키에 해당하는 또 다른 데이터로 해당데이터를 업데이트 하면 되는 것.
                    findSlot.value = value;
                    return true;
                }else{//만약 그렇지 않다면 순회해야함
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        }else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){//특정 key에 대해서 값을 가져오는 메소드
        Integer address = this.hashFunc(key);
        if(this.hashTable[address]!= null){
            Slot findSlot = this.hashTable[address];//현재 해쉬테이블의 슬롯이 헤드가됨.
            while (findSlot != null){
                if (findSlot.key == key){
                    return findSlot.value;
                }else{
                    findSlot = findSlot.next;
                }
            }
            return null;
        }else{//해당 데이터가 없다면
            return null;
        }
    }

    public static void main(String[] args) {
        ChainingHash chainingHash = new ChainingHash(20);
        chainingHash.saveData("Minwook", "01012345678");
        chainingHash.saveData("JJeong", "01023456789");
        chainingHash.saveData("J-Xia", "01012151215");
        chainingHash.saveData("Junsoo", "01012121515");
        System.out.println(chainingHash.getData("JJeong"));

    }
}
