package boj.입출력;

import java.util.Scanner;

public class Algorithm_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #"+ (i+1) + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}
