package boj.재귀;

public class Recursion_Function_HelloWorld {
    public static void main(String[] args) {
        HelloWorld(5);
    }

    public static void HelloWorld(int n){
        if(n == 0){
            return;
        }
        System.out.println("HelloWorld!");

        HelloWorld(n-1);
    }
}
