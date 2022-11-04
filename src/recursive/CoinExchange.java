package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class CoinExchange {

    static int n, m;
    static int answer = Integer.MAX_VALUE;
    public void DFS(int level, int sum, Integer[] arr) {
        if(sum > m) return;
        if(level >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, level);
        } else {
            for(int i = 0; i < n; i++) {
                DFS(level+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CoinExchange ce = new CoinExchange();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        m = Integer.parseInt(br.readLine());

        ce.DFS(0, 0, arr);

        System.out.println(answer);
    }
}
