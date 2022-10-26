package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdjacencyMatrix {

    static int n,m;
    static int count = 0;
    static int[][] graph;
    static int[] checked;

    static StringTokenizer st;
    public void DFS(int v) {
        if(v == n) count++;
        else {
            for(int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && checked[i] == 0) {
                    checked[i] = 1;
                    DFS(i);
                    checked[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        AdjacencyMatrix am = new AdjacencyMatrix();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        checked = new int[n+1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }

        checked[1] = 1;
        am.DFS(1);

        System.out.println(count);
    }
}
