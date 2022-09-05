package boj.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (100 >= num && num >= 90){
            System.out.println("A");
        } else if(89 >= num && num >= 80){
            System.out.println("B");
        } else if(79 >= num && num >= 70){
            System.out.println("C");
        } else if(69 >= num && num >= 60){
            System.out.println("D");
        } else if(60 > num){
            System.out.println("F");
        }
    }
}
