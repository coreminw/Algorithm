import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm_2522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
