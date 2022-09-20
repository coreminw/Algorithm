package boj.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        double[] arr = new double[num];
        double max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]/max) * 100;
        }
        System.out.println(sum/ num);
    }
}
