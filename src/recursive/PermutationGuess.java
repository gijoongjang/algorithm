package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermutationGuess {

    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int getCombination(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = getCombination(n-1, r-1) + getCombination(n-1, r);
    }

    public void DFS(int level, int sum) {
        if(flag) return;
        if(level == n) {
            if(sum == f) {
                for(int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[level] = i;
                    DFS(level+1, sum+(p[level] * b[level]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        PermutationGuess pg = new PermutationGuess();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i = 0; i < n; i++) {
            b[i] = pg.getCombination(n-1, i);
        }

        pg.DFS(0, 0);
    }
}
