package boj.입출력;

import java.util.Scanner;

public class Algorithm_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String n = sc.next();

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += n.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
