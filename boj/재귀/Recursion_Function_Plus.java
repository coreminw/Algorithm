package boj.재귀;

//1부터 N까지의 합
public class Recursion_Function_Plus {

    public static void main(String[] args) {
     int N = 5;
        System.out.println(Plus(N));
    }

    public static int Plus(int num){
        if (num == 0) {
            return 0;
        }
        return num + Plus(num -1);
    }
}
