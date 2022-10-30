package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SameSumSubset {

    static int n, total = 0;
    static String answer = "NO";
    static boolean flag = false;

    public void DFS(int level, int sum, int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(level == n) {
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(level+1, sum+arr[level], arr);
            DFS(level+1, sum, arr);
        }
    }

    public static void main(String[] args) throws Exception {
        SameSumSubset s = new SameSumSubset();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        s.DFS(0, 0, arr);

        System.out.println(answer);
    }
}
