package boj.입출력;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer stringTokenizer;
        String str;

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            str = sc.next();
            stringTokenizer = new StringTokenizer(str, ",");

            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(A + B);

        }
    }
}
