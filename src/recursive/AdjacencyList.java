package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AdjacencyList {
    static int n, m;
    static int count = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checked;
    static StringTokenizer st;
    public void DFS(int v) {
        if(v == n) {
            count++;
        } else {
            for(int next : graph.get(v)) {
                if(checked[next] == 0) {
                    checked[next] = 1;
                    DFS(next);
                    checked[next] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        AdjacencyList al = new AdjacencyList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        checked = new int[n+1];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        checked[1] = 1;
        al.DFS(1);
        System.out.println(count);
    }
}
