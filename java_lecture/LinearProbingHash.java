package Algorithm_FastCampus;

/* Linear Probing 기법
* 폐쇄 해슁 또는 Close Hashing 기법 중 하나: 해쉬 테이블 저장공간 안에서 충돌 문제를 해결하는 기법
* 쉽게말해 특정 슬롯이 충돌됐을 경우 그 슬롯 다음 슬롯에가서 비어있으면 저장하고, 그렇지 않으면 다른 슬롯에가서 저장하는 방법
*
* 시간복잡도(Linear Probing 과 Chaining 기법 둘 다 동일!
* 일반적인 경우 O(1)
* collision 이 모두 발생하는 경우 O(n) > 링크드리스트에서 n개가 있을때
*
* 배열에서 데이터를 저장하고, 검색할 때 O(n)
* 이상적인 해쉬 테이블 케이스에서 데이터를 검색할 때 O(1)
* */
public class LinearProbingHash {
    public LinearProbingHash.Slot[] hashTable; // Slot이라는 클래스를 기반으로 한 객체 배열을 만들 수 있는 변수 hashtable 생성

    public LinearProbingHash(Integer size){//생성자
        this.hashTable = new LinearProbingHash.Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key){//hashFunction 만들기
        return (int)(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){//저장을 했는지 판별하는 메소드
        Integer address = this.hashFunc(key);//맨처음에는 해당 데이터를 저장할 수 있는 주소를 가져와야함
        if(this.hashTable[address]!= null){//이미 한 번 데이터가 저장되어있음
            if(this.hashTable[address].key == key){
                this.hashTable[address].value = value;
                return true;
            }else {
                Integer currAddress = address + 1; //현재 address를 원래 계산했던 주소에서 한칸씩 이동
                while (this.hashTable[currAddress]!=null){//그 다음 슬롯이 있는지 없는지 확인
                    if(this.hashTable[currAddress].key == key){//key가 있고 key가 맞다면
                        this.hashTable[currAddress].value = value;
                        return true;
                    }else{
                        currAddress++; //무한정으로 늘리면 슬롯이외 바깥으로 나갈 수 있기때문에 더 생각해봐야함.
                        if(currAddress >= this.hashTable.length){// 따라서 배열을 넘어섰다면
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        }else {
            this.hashTable[address] = new LinearProbingHash.Slot(key, value);
        }
        return true;
    }

    public String getData(String key){//특정 key에 대해서 값을 가져오는 메소드
        Integer address = this.hashFunc(key);
        if(this.hashTable[address]!= null){
            if(this.hashTable[address].key == key){//해당하는 주소값에 내가 원하는 키값이 있다면 원하는 값을 반환만 해주면됨.
                return this.hashTable[address].value;
            }else{// 해당하는 주소값에 내가 원하는 키값이 없다면
                Integer currAddress = address + 1;// 한칸 다음 슬롯으로 넘어감
                while(this.hashTable[currAddress] != null){
                    if(this.hashTable[currAddress].key == key){
                        return this.hashTable[currAddress].value;
                    }else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length){
                            return null;
                        }
                    }
                }
                return null;
            }
        }else{//slot이 없다면 그냥 null 반환
           return null;
        }
    }
    public static void main(String[] args) {
        LinearProbingHash linearProbingHash = new LinearProbingHash(20);
        linearProbingHash.saveData("Minwook", "01012345678");
        linearProbingHash.saveData("JJeong", "01023456789");
        linearProbingHash.saveData("J-Xia", "01012151215");
        linearProbingHash.saveData("Junsoo", "01012121515");
        System.out.println(linearProbingHash.getData("JJeong"));
    }
}
