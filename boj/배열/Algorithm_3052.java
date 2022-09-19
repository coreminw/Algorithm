package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        boolean bl;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            bl = false;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    bl = true;
                    break;
                }
            }
            if(bl == false){
                count ++;
            }
        }
        System.out.println(count);
    }
}



//만약 숫자가 같은게 있으면 10개에서 빼주기