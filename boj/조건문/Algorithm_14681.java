package boj.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());

        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0){
            System.out.println(2);
        } else if (x < 0 && y < 0){
            System.out.println(3);
        } else if (x > 0 && y < 0){
            System.out.println(4);
        }
    }
}
