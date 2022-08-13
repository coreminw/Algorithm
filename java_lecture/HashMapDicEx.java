package java_lecture;

import java.util.*;

public class HashMapDicEx{
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("go", "고성용");
        h.put("min", "김민욱");
        h.put("jin", "진경재");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("찾고싶은 단어는?");
            String eng = sc.next();

            if(eng.equals("exit")){
                System.out.print("종료합니다...");
                break;
            }
            String kor = h.get(eng);
            if(kor==null)
                System.out.println(eng+"는 없는단어입니다.");
            else
                System.out.println(kor);

        }

    }
}
