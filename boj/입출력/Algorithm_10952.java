package boj.입출력;

import java.util.Scanner;

public class Algorithm_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0){
                break;
            }
            System.out.println(A + B);
        }
    }
}
