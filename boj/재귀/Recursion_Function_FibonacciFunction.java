package boj.재귀;

public class Recursion_Function_FibonacciFunction {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciFunction(i));
        }
    }
    public static int fibonacciFunction(int n){
        if(n == 0 ){
            return 0;
        }
        if(n == 1 || n ==2){
            return 1;
        }
        return fibonacciFunction(n-1) +fibonacciFunction(n-2);
    }
}
