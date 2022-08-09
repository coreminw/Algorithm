import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String[] week= {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] monthInDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;

        for (int i = 0; i < month ; i++) {
            count += monthInDays[i];
        }
        count += day - 1;
        System.out.println(week[count%7]);
    }
}
