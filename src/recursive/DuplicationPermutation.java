package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DuplicationPermutation {
    static int[] pm;
    static int n, m;
    public void DFS(int level) {
        if(level == m) {
            for(int x : pm) {
                System.out.print(x + " ");
                System.out.println();
            }
        } else {
            for(int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level+1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DuplicationPermutation dp = new DuplicationPermutation();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pm = new int[m];

        dp.DFS(0);
    }
}
