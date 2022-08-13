package java_lecture;

public class HashTable_Ex1 {
    public Slot[] hashTable; // Slot이라는 클래스를 기반으로 한 객체 배열을 만들 수 있는 변수 hashtable 생성

    public HashTable_Ex1(Integer size){//생성자
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    public int hashFunc(String key){//hashFunction 만들기
        return (int)(key.charAt(0))%this.hashTable.length;
   }

   public boolean saveData(String key, String value){//저장을 했는지 판별하는 메소드
        Integer address = this.hashFunc(key);//맨처음에는 해당 데이터를 저장할 수 있는 주소를 가져와야함
       if(this.hashTable[address]!= null){//이미 한 번 데이터가 저장되어있음
           this.hashTable[address].value = value;
       }else {
           this.hashTable[address] = new Slot(value);
       }
       return true;
   }

   public String getData(String key){//특정 key에 대해서 값을 가져오는 메소드
        Integer address = this.hashFunc(key);
        if(this.hashTable[address]!= null){
            return this.hashTable[address].value;
        }else{//해당 데이터가 없다면
            return null;
        }
   }

    public static void main(String[] args) {
        HashTable_Ex1 mainObject = new HashTable_Ex1(20);
        mainObject.saveData("Minwook", "01012345678");
        mainObject.saveData("JJeong", "01023456789");
        System.out.println(mainObject.getData("JJeong"));

    }
}
