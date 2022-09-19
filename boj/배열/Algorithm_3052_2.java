package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Algorithm_3052_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.println(hashSet.size());
    }
}

//HashSet
//중복되는 원소를 넣을 경우 하나만 저장한다.(중복원소를 허용하지 않는다.)
//HashSet은 순서 개념이 없어서 정렬하는 기능인 Collection.sort()메소드를 사용할 수 없다. (정렬하고 싶다면 리스트로 변환 후 정렬해야 한다.)
