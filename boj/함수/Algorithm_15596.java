package boj.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_15596 {
        long sum(int[] a){
            long sum = 0;

            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum;
        }
}
