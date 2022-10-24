package boj.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Algorithm_9012_괄호 {
    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //받은 String을 문자하나씩 넣기

            if(c == '('){ // 여는 괄호일 경우 스택에 넣기
                stack.push(c);
            } else if (stack.empty()){ //스택이 비어있다면 NO
                return "NO";
            } else{ // 위의 두 경우가 아니라면 pop
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        } else{
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);

    }

}