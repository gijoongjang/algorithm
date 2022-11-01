package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumScore {

    static int n, m;
    static int answer = Integer.MIN_VALUE;
    static StringTokenizer st;
    public void DFS(int level, int sum, int time, int[] scoreArr, int[] timeArr) {
        if(time > m) return;
        if(level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level+1, sum+scoreArr[level], time+timeArr[level], scoreArr, timeArr);
            DFS(level+1, sum, time, scoreArr, timeArr);
        }
    }

    public static void main(String[] args) throws Exception{
        MaximumScore ms = new MaximumScore();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] scoreArr = new int[n];
        int[] timeArr = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            scoreArr[i] = Integer.parseInt(st.nextToken());
            timeArr[i] = Integer.parseInt(st.nextToken());
        }

        ms.DFS(0, 0, 0, scoreArr, timeArr);

        System.out.println(answer);
    }
}
