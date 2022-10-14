package boj.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//stack class 사용
public class Algorithm_10773_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                stack.pop();
            } else{
                stack.push(num);
            }
        }
        for (int n : stack) { //for-each 문 ex) String[] numbers = {"one", "two"}   for(string number: numbers){ sout(numbers)};
            sum += n;
        }
        System.out.println(sum);

    }
}
