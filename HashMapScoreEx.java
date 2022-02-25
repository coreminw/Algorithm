import java.util.*;

public class HashMapScoreEx {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("이재문", 70);
        h.put("한원선", 99);
        h.put("김남윤", 98);
        h.put("김성동", 97);
        h.put("황기태", 88);

        System.out.println("HashMap의 요소 개수"+ h.size());

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String name = it.next();
            int score = h.get(name);
            System.out.println(name +" "+score);
        }
    }
}
