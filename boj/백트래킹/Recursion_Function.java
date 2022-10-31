package boj.백트래킹;

//백트래킹을 하기전 재귀함수에 대해 먼저 풀어보기
public class Recursion_Function {
    public static void main(String[] args) {
        HelloWorld(5);
    }
    public static void HelloWorld(int n){
        if(n == 0){
            return ;
        }
        System.out.println("Hello world");
        HelloWorld(n-1);
    }
}
