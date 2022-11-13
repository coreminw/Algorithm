package boj.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_25501_재귀의귀재{
    public static int count;
    public static int recursion(String s, int l, int r){
        count ++;
        if(l >= r) {
            return 1;
        } else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else{
            return recursion(s, l+1, r-1);
        }
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            System.out.println(isPalindrome(br.readLine()) + " " + count);
        }
    }
}