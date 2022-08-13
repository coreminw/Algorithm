public class Slot {
    String value;

    public Slot(String value){
        this.value = value;
    }

    public static void main(String[] args) {
        /*
        slot[] hashTable = new Slot[20];
        System.out.println(hashTable[0]);
        의 값은 null이 나옴. 단순히 테이블을 만들기만 했기 때문에..
        따라서 아래와 같이 table 안에 값을 넣어줘야하고, 값을 알고싶다면 .value를 붙여야함
       */

        Slot[] hashTable = new Slot[20];
        hashTable[0] = new Slot("Test");
        System.out.println(hashTable[0]);
        System.out.println(hashTable[0].value);
    }
}
