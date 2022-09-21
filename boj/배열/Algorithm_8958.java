package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] arr = new String[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O'){
                    num ++;
                } else{
                    num = 0;
                }
                sum += num;
            }
            System.out.println(sum);
        }
    }
}

// O가 연속으로 나올 때 num = 1이고 num = num + 1
// x가 나오면 다시 num은 초기화