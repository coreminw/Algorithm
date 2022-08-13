package java_lecture;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<Integer>();
        v.add(6);
        v.add(4);
        v.add(3);
        v.add(2);
        v.add(1,5);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
        
    }
}
