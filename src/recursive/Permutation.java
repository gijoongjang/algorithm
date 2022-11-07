package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {

    static int n, m;
    static int[] pm, arr, checked;
    static StringTokenizer st;
    public void DFS(int level) {
        if(level == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(checked[i] == 0) {
                    pm[level] = arr[i];
                    checked[i] = 1;
                    DFS(level+1);
                    checked[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Permutation p = new Permutation();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        checked = new int[n];
        pm = new int[m];

        p.DFS(0);
    }
}
