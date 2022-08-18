package boj.다양한문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm_10825_국영수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, (arr1, arr2) ->{

            if (Integer.parseInt(arr1[1]) == Integer.parseInt(arr2[1])){ // 국어점수가 같다면
                if((Integer.parseInt(arr1[2]) == Integer.parseInt(arr2[2]))){
                    if((Integer.parseInt(arr1[3]) == Integer.parseInt(arr2[3]))){
                        return arr1[0].compareTo(arr2[0]);
                    }
                    return Integer.parseInt(arr2[3]) - Integer.parseInt(arr1[3]); //수학점수 내림차순 정렬
                }
                return Integer.parseInt(arr1[2]) - Integer.parseInt(arr2[2]); // 영어점수 오름차순 정렬
            }
            return Integer.parseInt(arr2[1]) - Integer.parseInt(arr1[1]); // 국어점수 내림차순 정렬
        });


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
