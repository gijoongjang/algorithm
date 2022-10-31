package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeaviestWeight {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int level, int sum, int[] arr) {
        if(sum > c) return;
        if(level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level+1, sum+arr[level], arr);
            DFS(level+1, sum, arr);
        }
    }

    public static void main(String[] args) throws Exception{
        HeaviestWeight h = new HeaviestWeight();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        h.DFS(0, 0, arr);

        System.out.println(answer);
    }
}
